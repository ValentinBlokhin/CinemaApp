package com.cinema.services.impl;

import com.cinema.model.viewModels.PostQuoteModel;
import com.cinema.services.RestService;
import com.google.common.base.Joiner;
import com.google.common.collect.Iterators;
import org.codehaus.jackson.map.ObjectMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created on 01.08.14.
 */
@Component
public class RestServiceImpl implements RestService {

    private List<PostQuoteModel> viewModel = new ArrayList<PostQuoteModel>();
    private List<String> normalizedArray = new ArrayList<String>();

    private static final String URL = "http://bash.im/";

    private Document document = null;

    @Override
    public String getNews() {
        String[] ids = getNewsIds();
        Iterator<String> it = Iterators.forArray(ids);
        int i = 0;
        final Elements element = getDocument().select("div.text");


        while (it.hasNext()) {
            final String current_id = it.next();

            if (current_id.isEmpty()) {
                continue;
            }

            final int finalI = i;
            viewModel.add(new PostQuoteModel() {
                {
                    setIds(current_id);
                    List<TextNode> array = element.get(finalI).textNodes();
                    for (TextNode node : array) {
                        normalizedArray.add(node.text());
                    }
                    setQuotes(Joiner.on("-:-").join(normalizedArray));
                    normalizedArray.clear();
                }
            });
            ++i;
        }

        ObjectMapper mapper = new ObjectMapper();
        String json = "";
        try {
            json = mapper.writeValueAsString(viewModel);
            viewModel.clear();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }

    @Override
    public String getQuotes(Integer id) {
        try {
            Document document = Jsoup.connect("http://bash.im/quote/" + id).get();
            Elements element = document.select("div.text");
            return element.text();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String[] getNewsIds() {
        Elements element = getDocument().select("a.id").not(":empty");
        return element.text().trim().split("(?:#)");
    }

    private Document getDocument() {
        if (document == null) {
            try {
                return Jsoup.connect(URL).get();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return document;
    }
}
