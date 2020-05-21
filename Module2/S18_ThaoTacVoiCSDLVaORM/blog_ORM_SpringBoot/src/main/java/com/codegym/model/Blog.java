package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String content;
    private String author;
    private String creationTime;

    public Blog() {
    }

    public Blog(String title, String content, String author, String creationTime) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.creationTime = creationTime;
    }

    @Override
    public String toString() {
        return String.format("Blog[id=%d, title='%s', content='%s', author='%s', creationTime='%s',]",
                id, title, content, author, creationTime);
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }
}
