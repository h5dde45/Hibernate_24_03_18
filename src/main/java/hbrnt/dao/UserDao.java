package hbrnt.dao;

import hbrnt.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    public User findById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return (User) session.get(User.class, id);
    }

    public void save(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }

    public void update(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.update(user);
    }

    public void delete(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(user);
    }

}
