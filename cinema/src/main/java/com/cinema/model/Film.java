package com.cinema.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

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

}
