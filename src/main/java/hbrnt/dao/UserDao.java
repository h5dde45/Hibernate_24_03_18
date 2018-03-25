package hbrnt.dao;

import hbrnt.models.Auto;
import hbrnt.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    public User findById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return (User) session.load(User.class, id);
    }

    public void save(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }

    public void update(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.update(user);
    }

    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        User user = (User) session.load(User.class, id);
        if(user!=null) {
            session.delete(user);
        }
    }
    public Auto findAutoById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return (Auto) session.get(Auto.class, id);
    }
    public List<User> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return (List<User>) session.createQuery("from User").list();
    }
}
