package org.example.HomeWork.casino;

import java.util.ArrayList;
import java.util.List;

public class Casino {
    private List<User> users;

    public Casino() {
        users = new ArrayList<>();
    }

    public boolean register(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return false;
            }
        }
        users.add(new User(username, password));
        return true;
    }

    public void User(String username, String password) {
    }

    public User login(String username, String password) {
        for (User user : users) {
            if (user.getUsername() != null && user.getPassword() != null &&
                    user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}


