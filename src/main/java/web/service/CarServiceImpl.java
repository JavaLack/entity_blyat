package web.service;

import org.springframework.stereotype.Service;
import web.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    final Dao dao;
    @Autowired
    public CarServiceImpl(Dao dao) {
        this.dao = dao;
    }

    @Override
    public List<User> getUsers() {

        return dao.getUsers();
    }

    @Override
    public User showId(int id) {
        return dao.showId(id);
    }

    @Override
    public void save(User user) {
        dao.save(user);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }

    @Override
    public void update(int id, User user) {
        dao.update(id, user);
    }
}
