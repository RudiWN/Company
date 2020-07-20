package com.company.company.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Meeting {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;

    long lokaal;
    long duurInMinuten;


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getLokaal() {
        return lokaal;
    }
    public void setLokaal(long name) {
        this.lokaal = lokaal;
    }
    public long getDuurInMinuten() {
        return duurInMinuten;
    }
<<<<<<< HEAD
    public void setDuurInMinuten(long minuten) {
        this.duurInMinuten = minuten;
=======
    public void setDuurInMinuten(long duurInMinuten) {
        this.duurInMinuten = duurInMinuten;
>>>>>>> master
    }
}
