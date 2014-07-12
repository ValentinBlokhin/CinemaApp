package com.cinema.dao;

import com.cinema.model.persistence.HallRow;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Elena on 12.07.2014.
 */
public interface HallRowDao extends CrudRepository<HallRow, Integer> {
}
