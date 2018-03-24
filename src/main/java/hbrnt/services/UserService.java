package hbrnt.services;

import hbrnt.dao.UserDao;
import hbrnt.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    public User findUser(int id) {
        return userDao.findById(id);
    }
}
