package com.cinema.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Elena on 11.07.2014.
 */
@Entity
public class Hall implements Serializable{

    @Id
    @Column(name = "idHall")
    private Integer idHall;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "countofRows")
    private Integer countofRows;

    @OneToMany(mappedBy = "hall", cascade = {CascadeType.REMOVE, CascadeType.REFRESH})
    List<HallRow> hallRows;

    public Integer getIdHall() {
        return idHall;
    }

    public void setIdHall(Integer idHall) {
        this.idHall = idHall;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCountofRows() {
        return countofRows;
    }

    public void setCountofRows(Integer countofRows) {
        this.countofRows = countofRows;
    }

    public List<HallRow> getHallRows() {
        return hallRows;
    }

    public void setHallRows(List<HallRow> hallRows) {
        this.hallRows = hallRows;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hall hall = (Hall) o;

        if (countofRows != null ? !countofRows.equals(hall.countofRows) : hall.countofRows != null) return false;
        if (!idHall.equals(hall.idHall)) return false;
        if (name != null ? !name.equals(hall.name) : hall.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idHall.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (countofRows != null ? countofRows.hashCode() : 0);
        return result;
    }
}
