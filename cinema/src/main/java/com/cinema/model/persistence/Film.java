package com.cinema.model.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Elena on 11.07.2014.
 */
@Entity
public class Film implements Serializable {

    @Id
    @Column(name = "idFilm")
    private Integer idFilm;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "film", cascade = {CascadeType.REMOVE, CascadeType.REFRESH})
    private List<CinemaSession> sessions;

    public Integer getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(Integer idFilm) {
        this.idFilm = idFilm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

        Film film = (Film) o;

        if (description != null ? !description.equals(film.description) : film.description != null) return false;
        if (!idFilm.equals(film.idFilm)) return false;
        if (name != null ? !name.equals(film.name) : film.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFilm.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
