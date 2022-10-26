package com.example.ToDo.dao;

import com.example.ToDo.model.PostsModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface PostsDao extends CrudRepository<PostsModel, Integer> {

    @Query(value="SELECT * FROM `posts` WHERE `userid`=:userid",nativeQuery = true)
    List<Map<String,String>>ViewmyPosts(int userid);


}

