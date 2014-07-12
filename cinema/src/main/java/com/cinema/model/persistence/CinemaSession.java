package com.cinema.model.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

/**
 * Created by Elena on 12.07.2014.
 */
@Entity
public class CinemaSession implements Serializable{

    @Id
    @Column(name = "idCinemaSession")
    private Integer idCinemaSession;

    @Basic
    @Column(name = "idSeat")
    private Integer idSeat;

    @Basic
    @Column(name = "idFilm")
    private Integer idFilm;

    @Basic
    @Column(name = "status")
    private String status;

    @Basic
    @Column(name = "sessionDate")
    private Date sessionDate;

    @Basic
    @Column(name = "sessionTime")
    private Time sessionTime;

    @Basic
    @Column(name = "price")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "idFilm", referencedColumnName = "idFilm", insertable = false, updatable = false, nullable = false)
    private Film film;

    @ManyToOne
    @JoinColumn(name = "idSeat", referencedColumnName = "idSeat", insertable = false, updatable = false, nullable = false)
    private Seat seat;

    @OneToMany(mappedBy = "cinemaSession", cascade = {CascadeType.REMOVE, CascadeType.REFRESH})
    private List<Ticket> tickets;

    public Integer getIdCinemaSession() {
        return idCinemaSession;
    }

    public void setIdCinemaSession(Integer idCinemaSession) {
        this.idCinemaSession = idCinemaSession;
    }

    public Integer getIdSeat() {
        return idSeat;
    }

    public void setIdSeat(Integer idSeat) {
        this.idSeat = idSeat;
    }

    public Integer getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(Integer idFilm) {
        this.idFilm = idFilm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(Date sessionDate) {
        this.sessionDate = sessionDate;
    }

    public Time getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(Time sessionTime) {
        this.sessionTime = sessionTime;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CinemaSession that = (CinemaSession) o;

        if (!idCinemaSession.equals(that.idCinemaSession)) return false;
        if (!idFilm.equals(that.idFilm)) return false;
        if (!idSeat.equals(that.idSeat)) return false;
        if (sessionDate != null ? !sessionDate.equals(that.sessionDate) : that.sessionDate != null) return false;
        if (sessionTime != null ? !sessionTime.equals(that.sessionTime) : that.sessionTime != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCinemaSession.hashCode();
        result = 31 * result + idSeat.hashCode();
        result = 31 * result + idFilm.hashCode();
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (sessionDate != null ? sessionDate.hashCode() : 0);
        result = 31 * result + (sessionTime != null ? sessionTime.hashCode() : 0);
        return result;
    }
}
