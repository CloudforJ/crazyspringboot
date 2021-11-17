package org.crazyit.firstboot.domain;

import javax.persistence.*;

@Entity
@Table(name = "book_inf")
public class Book {
    @Id
    @Column(name = "book_inf")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String author;
    private double price;

//    public Book(String title, String author, double price) {
//        this.title = title;
//        this.author = author;
//        this.price = price;
//    }

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
