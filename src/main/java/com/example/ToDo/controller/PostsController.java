package com.example.ToDo.controller;

import com.example.ToDo.dao.PostsDao;
import com.example.ToDo.model.PostsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

@RestController
public class PostsController {

    @Autowired
    private PostsDao Dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addpost",consumes = "application/json", produces = "application/json")
    public String addPost(@RequestBody PostsModel post) {
        DateTimeFormatter dt=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now=LocalDateTime.now();
        String CurrentDate=String.valueOf(dt.format(now));
        post.setPostdate(dt.format(now));
        System.out.println(post.toString());
        Dao.save(post);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/viewnotes",consumes ="application/json", produces = "application/json" )
public List<Map<String,String>>MyNotes(@RequestBody PostsModel post) {
        return (List<Map<String,String>>)Dao.ViewmyPosts(post.getUserid());
    }


}
