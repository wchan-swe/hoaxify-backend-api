package com.hoaxify.controller;

import com.hoaxify.user.User;

public class TestUtil {
    public static User createValidUser() {
        User user = new User();
        user.setUsername("test-user");
        user.setDisplayName("test-display");
        user.setPassword("P4ssword");
        return user;
    }
}