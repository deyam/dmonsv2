package com.example.model.impl;

import com.example.model.User;
import com.example.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by deya on 8/22/16.
 */

@Repository
public class UserJdbcRepository implements UserRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

//    @Override
//    public void create(User user) {
//        String sql = "INSERT INTO users " +
//                "(id, username) VALUES (seq_users_id.nextval, ?)";
//
//        jdbcTemplate.update(sql, new Object[] { user.getUsername() });
//    }

    @Override
    public List<User> getAll() {
        String sql = "SELECT user_id, username, account_status FROM dba_users";

        return jdbcTemplate.query(sql,
                (resultSet, rowNum) ->
                        new User(  resultSet.getLong("user_id"),
                                resultSet.getString("username"),
                                resultSet.getString("account_status")
                        ));
    }
}