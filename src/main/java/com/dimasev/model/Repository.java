package com.dimasev.model;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private static List<User> users = new ArrayList<>();
    static {
        users.add(new User(1, "Alex",18));
        users.add(new User(2, "Ivan",35));
        users.add(new User(3, "Petr",24));
        users.add(new User(4, "Dima",29));
        users.add(new User(5, "Tima", 18));
    }

    public static List<User> getUsers() {
        return users;
    }

    public static void setUsers(List<User> users) {
        Repository.users = users;
    }
}
