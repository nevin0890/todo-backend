package com.example.ToDo.dao;

import com.example.ToDo.model.UserModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDao extends CrudRepository<UserModel, Integer> {

@Query(value="SELECT * FROM `users` WHERE `email`=:email AND`password`=:password",nativeQuery = true)
List<UserModel> Userlogin(String email, String password);
}
