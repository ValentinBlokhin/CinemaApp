package com.cinema.model.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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
    @JoinColumn(name = "idRow", referencedColumnName = "idHallRow", insertable = false, updatable = false, nullable = false)
    private HallRow hallRow;

    @OneToMany(mappedBy = "seat", cascade = {CascadeType.REMOVE, CascadeType.REFRESH})
    private List<CinemaSession> sessions;

    public Integer getIdSeat() {
        return idSeat;
    }

    public void setIdSeat(Integer idSeat) {
        this.idSeat = idSeat;
    }

    public Integer getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(Integer seatNo) {
        this.seatNo = seatNo;
    }

    public Integer getIdRow() {
        return idRow;
    }

    public void setIdRow(Integer idRow) {
        this.idRow = idRow;
    }

    public HallRow getHallRow() {
        return hallRow;
    }

    public void setHallRow(HallRow hallRow) {
        this.hallRow = hallRow;
    }

    public List<CinemaSession> getSessions() {
        return sessions;
    }

    public void setSessions(List<CinemaSession> sessions) {
        this.sessions = sessions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Seat seat = (Seat) o;

        if (!idRow.equals(seat.idRow)) return false;
        if (!idSeat.equals(seat.idSeat)) return false;
        if (seatNo != null ? !seatNo.equals(seat.seatNo) : seat.seatNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSeat.hashCode();
        result = 31 * result + (seatNo != null ? seatNo.hashCode() : 0);
        result = 31 * result + idRow.hashCode();
        return result;
    }
}
