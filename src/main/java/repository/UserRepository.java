package repository;

import domain.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    static Map<String,User> users = new HashMap<>();
    public User findByName(String userName) {
        if (users.containsKey(userName)){
            return users.get(userName);
        }

        User user = new User(userName);
        users.put(userName, user);
        return user;
    }
}
