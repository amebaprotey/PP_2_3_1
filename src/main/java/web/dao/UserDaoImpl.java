package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.*;
import java.util.List;
@Component
public class UserDaoImpl implements Dao{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public List<User> listUsers() {
        return entityManager.createQuery("From User").getResultList();

    }

    @Override
    public User show(int id) {
        return entityManager.find(User.class,id);
    }

    @Override
    public void update(int id, User user) {
        User user1 = show(id);
        user1.setName(user.getName());
        user1.setSurname(user.getSurname());
        entityManager.merge(user1);

    }

    @Override
    public void delete(int id) {
        entityManager.remove(show(id));
    }


}
