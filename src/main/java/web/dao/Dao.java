package web.dao;

import web.model.User;

import java.util.List;

public interface Dao {
    void add(User user);
    List<User> listUsers();
    User show(int id);
    void update(int id, User user);
    void delete(int id);
}
