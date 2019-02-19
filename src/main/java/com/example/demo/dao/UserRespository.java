package com.example.demo.dao;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author:bai
 * @data:2019/2/18
 **/
public interface UserRespository extends JpaRepository<User,Long> {
    User findByUserName(String username);
    User findByUserNameOrEmail(String username,String email);
}
