package com.example.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

class UserRowMapper //implements RowMapper<User>
{
    //@Override
    public String mapRow1(ResultSet rs, int rowNum) throws SQLException
    {
//        User user = new User();
//        user.setUser_id(rs.getInt("user_id"));
//        user.setUsername(rs.getString("username"));
//        user.setAccount_status(rs.getString("account_status"));
//        System.out.println("got user:"+user.getUser_id());
//        return user;
        System.out.println("Nulls - Skipped");
        return "Skipped";
    }
}