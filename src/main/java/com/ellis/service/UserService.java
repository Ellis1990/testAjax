package com.ellis.service;

import com.ellis.entity.User;

import java.util.List;

public interface UserService {
    public void register(User user);
    public void deleteUser(String id);
    public User getUserByUsername(String username);
    public List<User> getAllUsers();


}
