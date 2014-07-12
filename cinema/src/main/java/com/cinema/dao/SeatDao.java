package com.cinema.dao;

import com.cinema.model.persistence.Seat;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Elena on 12.07.2014.
 */
public interface SeatDao extends CrudRepository<Seat, Integer> {
}
