package com.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
//
//@Repository
//public class UserRepository
//{
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @Transactional(readOnly=true)
//    public List<User> findAll() {
//        System.out.println("in list users, userRepo..");
//        return jdbcTemplate.query("select * from dba_users", new UserRowMapper());
//    }
//}


@Repository
public interface UserRepository {
    public List<User> getAll();
}
