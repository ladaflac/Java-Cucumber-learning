package com.javafortesters.domainentities;

/**
 * Created by Lada on 10.4.2016.
 */
public class User {
    private String username;
    private String password;

    public User() {
        username = "username";
        password = "password";
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
