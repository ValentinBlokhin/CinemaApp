package com.cinema.model.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by Elena on 12.07.2014.
 */
@Entity
public class Ticket implements Serializable {

    @Id
    @Column(name = "idTicket")
    private Integer idTicket;

    @Basic
    @Column(name = "idCinemaSession")
    private Integer idCinemaSession;

    @Basic
    @Column(name = "ticketZipCode")
    private Integer ticketZipCode;

    @Basic
    @Column(name = "orderDate")
    private Date orderDate;

    @ManyToOne
    @JoinColumn(name = "idCinemaSession", referencedColumnName = "idCinemaSession", insertable = false, updatable = false, nullable = false)
    private CinemaSession cinemaSession;

    public Integer getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Integer idTicket) {
        this.idTicket = idTicket;
    }

    public Integer getIdCinemaSession() {
        return idCinemaSession;
    }

    public void setIdCinemaSession(Integer idCinemaSession) {
        this.idCinemaSession = idCinemaSession;
    }

    public Integer getTicketZipCode() {
        return ticketZipCode;
    }

    public void setTicketZipCode(Integer ticketZipCode) {
        this.ticketZipCode = ticketZipCode;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public CinemaSession getCinemaSession() {
        return cinemaSession;
    }

    public void setCinemaSession(CinemaSession cinemaSession) {
        this.cinemaSession = cinemaSession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (!idCinemaSession.equals(ticket.idCinemaSession)) return false;
        if (!idTicket.equals(ticket.idTicket)) return false;
        if (orderDate != null ? !orderDate.equals(ticket.orderDate) : ticket.orderDate != null) return false;
        if (ticketZipCode != null ? !ticketZipCode.equals(ticket.ticketZipCode) : ticket.ticketZipCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTicket.hashCode();
        result = 31 * result + idCinemaSession.hashCode();
        result = 31 * result + (ticketZipCode != null ? ticketZipCode.hashCode() : 0);
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        return result;
    }
}
