package com.baraq.reports.entity;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @Column(name="id", nullable = false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(name="title", nullable = false)
    private String title;
    @Column(name="author", nullable = false)
    private String author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}




