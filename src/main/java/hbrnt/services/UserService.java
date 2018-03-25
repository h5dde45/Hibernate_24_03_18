package hbrnt.services;

import hbrnt.dao.UserDao;
import hbrnt.models.Auto;
import hbrnt.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    public User findUser(int id) {
        return userDao.findById(id);
    }

    @Transactional
    public void saveUser(User user) {
        userDao.save(user);
    }

    @Transactional
    public void deleteUser(int id) {
        userDao.delete(id);
    }

    @Transactional
    public void updateUser(User user) {
        userDao.update(user);
    }

    @Transactional
    public List<User> findAllUsers() {
        return userDao.findAll();
    }

    @Transactional
    public Auto findAutoById(int id) {
        return userDao.findAutoById(id);
    }
}
