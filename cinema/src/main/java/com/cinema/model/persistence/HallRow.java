package com.cinema.model.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Elena on 12.07.2014.
 */
@Entity
public class HallRow implements Serializable {

    @Id
    @Column(name = "idHallRow")
    private Integer idHallRow;

    @Basic
    @Column(name = "rowNo")
    private Integer rowNo;

    @Basic
    @Column(name = "countofPlaces")
    private Integer countOfPlaces;

    @Basic
    @Column(name = "idHall")
    private Integer idHall;

    @ManyToOne
    @JoinColumn(name = "idHall", referencedColumnName = "idHall", insertable = false, updatable = false, nullable = false)
    private Hall hall;

    @OneToMany(mappedBy = "hallRow", cascade = {CascadeType.REMOVE, CascadeType.REFRESH})
    private List<Seat> seats;

    public Integer getIdHallRow() {
        return idHallRow;
    }

    public void setIdHallRow(Integer idHallRow) {
        this.idHallRow = idHallRow;
    }

    public Integer getRowNo() {
        return rowNo;
    }

    public void setRowNo(Integer rowNo) {
        this.rowNo = rowNo;
    }

    public Integer getCountOfPlaces() {
        return countOfPlaces;
    }

    public void setCountOfPlaces(Integer countOfPlaces) {
        this.countOfPlaces = countOfPlaces;
    }

    public Integer getIdHall() {
        return idHall;
    }

    public void setIdHall(Integer idHall) {
        this.idHall = idHall;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HallRow hallRow = (HallRow) o;

        if (countOfPlaces != null ? !countOfPlaces.equals(hallRow.countOfPlaces) : hallRow.countOfPlaces != null)
            return false;
        if (!idHall.equals(hallRow.idHall)) return false;
        if (!idHallRow.equals(hallRow.idHallRow)) return false;
        if (rowNo != null ? !rowNo.equals(hallRow.rowNo) : hallRow.rowNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idHallRow.hashCode();
        result = 31 * result + (rowNo != null ? rowNo.hashCode() : 0);
        result = 31 * result + (countOfPlaces != null ? countOfPlaces.hashCode() : 0);
        result = 31 * result + idHall.hashCode();
        return result;
    }
}
