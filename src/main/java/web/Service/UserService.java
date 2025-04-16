package web.Service;

import web.Model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getById(long id);

    User save(User user);

    void delete(long id);
}