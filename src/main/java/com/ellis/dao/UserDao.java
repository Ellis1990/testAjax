package com.ellis.dao;

import com.ellis.entity.User;

import java.util.List;

public interface UserDao {
    public List<User> selectAll();
    public User selectUserByUsernname(String username);
    public void insertUser(User user);
    public void deleteUserByid(String id);
}
