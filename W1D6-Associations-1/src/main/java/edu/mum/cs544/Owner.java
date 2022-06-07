package edu.mum.cs544;

import javax.persistence.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Entity
public class Owner {
    @Id
    private Long id;
    private String name;
    private String address;


    public Owner(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Owner() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
