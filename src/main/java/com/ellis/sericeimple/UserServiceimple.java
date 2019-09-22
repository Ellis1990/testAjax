package com.ellis.sericeimple;

import com.ellis.dao.UserDao;
import com.ellis.entity.User;
import com.ellis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserServiceimple implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void register(User user) {
        String id = UUID.randomUUID().toString().replace("-","");
        user.setId(id);
        userDao.insertUser(user);

    }

    @Override
    public void deleteUser(String id) {
        userDao.deleteUserByid(id);

    }

    @Override
    public User getUserByUsername(String username) {
        User user = userDao.selectUserByUsernname(username);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = userDao.selectAll();
        return users;

    }
}
