package com.example.ToDo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class PostsModel {


    @Id
    @GeneratedValue

        private int id;
        private int userid;
        private String notes;
        private String postdate;

    public PostsModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPostdate() {
        return postdate;
    }

    public void setPostdate(String postdate) {
        this.postdate = postdate;
    }

    public PostsModel(int id, int userid, String notes, String postdate) {
        this.id = id;
        this.userid = userid;
        this.notes = notes;
        this.postdate = postdate;
    }
}
