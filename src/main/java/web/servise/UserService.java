package web.servise;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.Dao;
import web.model.User;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserService {

    private Dao userDao;
    @Autowired
    public UserService(Dao userDao) {
        this.userDao = userDao;
    }
    public List<User> findAll(){
        return userDao.listUsers();
    }
    public User findOne(int id){
        return userDao.show(id);
    }
    @Transactional
    public void save(User user){
        userDao.add(user);
    }
    @Transactional
    public void update(int id, User user){
        userDao.update(id,user);

    }
    @Transactional
    public void delete(int id){
        userDao.delete(id);
    }
}
