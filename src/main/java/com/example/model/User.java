package com.example.model;

public class User
{
    private Long user_id;
    private String username;

    public User(Long user_id, String username, String account_status) {
        this.user_id = user_id;
        this.username = username;
        this.account_status = account_status;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccount_status() {
        return account_status;
    }

    public void setAccount_status(String account_status) {
        this.account_status = account_status;
    }

    private String account_status ;
 
    // setters & getters
}