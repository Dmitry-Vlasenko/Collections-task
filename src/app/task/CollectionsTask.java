package app.task;

import app.entity.User;

import java.util.ArrayList;
import java.util.List;

public class CollectionsTask {
    private final List<User> users;

    public CollectionsTask() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void printUsers() {
        for (int i = 0; i < users.size(); i++) {
            System.out.println((i + 1) + ". " + users.get(i));
        }
    }

    public User getUserAtIndex(int index) {
        if (index >= 0 && index < users.size()) {
            return users.get(index);
        } else {
            return null;
        }
    }
}