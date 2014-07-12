package com.cinema.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

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
}
