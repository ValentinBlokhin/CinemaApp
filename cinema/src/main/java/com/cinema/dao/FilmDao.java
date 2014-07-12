package com.cinema.dao;

import com.cinema.model.persistence.Film;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Elena on 11.07.2014.
 */
public interface FilmDao extends CrudRepository<Film, Integer> {
}
