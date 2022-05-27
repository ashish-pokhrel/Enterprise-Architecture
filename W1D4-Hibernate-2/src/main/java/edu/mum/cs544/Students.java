package edu.mum.cs544;

import java.sql.*;
import javax.persistence.*;

@Entity(name = "edu.mum.cs544.Students")
@Table(name = "students")
public class Students {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "\"id\"", nullable = false)
    private Integer id;
    @Column(name = "\"name\"", nullable = true)
    private String name;
    @Column(name = "\"email\"", nullable = true)
    private String email;
    @Column(name = "\"password\"", nullable = true)
    private String password;

    public Students(Integer id, String name, String email, String password) {
        setId(id);
        setEmail(email);
        setName(name);
        setPassword(password);
    }

    public Students() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}