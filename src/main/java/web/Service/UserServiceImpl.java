package web.Service;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    private static int PEOPLE_COUNT;
    private List<User> users;

    {
        users = new ArrayList<User>();

        users.add(new User(++PEOPLE_COUNT, "Evgeny", "Lapshin", 24));
        users.add(new User(++PEOPLE_COUNT, "Mikhail", "Mikhail", 25));
        users.add(new User(++PEOPLE_COUNT, "Max", "Max", 26));
        users.add(new User(++PEOPLE_COUNT, "Vas", "Vas", 27));

    }

    public List<User> index() {
        return users;
    }

    public User show(int id) {
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

    public void save(User user) {
        user.setId(++PEOPLE_COUNT);
        users.add(user);
    }

    public void delete(int id) {
        users.removeIf(user -> user.getId() == id);
    }
}