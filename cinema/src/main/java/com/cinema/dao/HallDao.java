package com.cinema.dao;

import com.cinema.model.persistence.Hall;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Elena on 12.07.2014.
 */
public interface HallDao extends CrudRepository<Hall, Integer> {
}
