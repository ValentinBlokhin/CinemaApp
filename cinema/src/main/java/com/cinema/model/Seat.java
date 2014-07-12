package com.cinema.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Elena on 12.07.2014.
 */
@Entity
public class Seat implements Serializable{

    @Id
    @Column(name = "idSeat")
    private Integer idSeat;

    @Basic
    @Column(name = "seatNo")
    private Integer seatNo;

    @Basic
    @Column(name = "idRow")
    private Integer idRow;

    @ManyToOne
    @JoinColumn(name = "idHallRow", referencedColumnName = "idHallRow", insertable = false, updatable = false, nullable = false)
    private HallRow hallRow;



}
