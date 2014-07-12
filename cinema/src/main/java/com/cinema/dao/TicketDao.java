package com.cinema.dao;

import com.cinema.model.persistence.Ticket;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Elena on 12.07.2014.
 */
public interface TicketDao extends CrudRepository<Ticket, Integer> {
}
