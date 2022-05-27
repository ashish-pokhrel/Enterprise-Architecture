package edu.mum.cs544;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Book {

    @Id
    private Integer id;
    private String title;
    private String ISBN;
    private String author;
    private double price;
    private java.util.Date publish_date;

    public Book(Integer id, String title, String iSBN, String author, double price, java.util.Date pDate) {
        setId(id);
        setTitle(title);
        setISBN(iSBN);
        setAuthor(author);
        setPrice(price);
        setPublish_date(pDate);
    }

    public Book() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(Date publish_date) {
        this.publish_date = publish_date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}