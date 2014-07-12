package com.cinema.dao;

import com.cinema.model.persistence.CinemaSession;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Elena on 12.07.2014.
 */
public interface CinemaSessionDao extends CrudRepository<CinemaSession, Integer> {
}
