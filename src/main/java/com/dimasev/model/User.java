package com.dimasev.model;

public class User {
    private int userId;
    private String userName;
    private int userAge;

    public User(int userId, String userName, int userAge) {
        this.userId = userId;
        this.userName = userName;
        this.userAge = userAge;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(userId).append(" ");
        sb.append(userName).append(" ");
        sb.append(userAge).append(" ");
        return sb.toString();
    }
}
