package com.cn.dao;


import java.util.List;

public class User {
    private  String username;
    private  String password;

    private List<String> addresslist;

    public List<String> getAddresslist() {
        return addresslist;
    }

    public void setAddresslist(List<String> addresslist) {
        this.addresslist = addresslist;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        System.out.println("2.赋值"+username);
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        System.out.println("2.赋值"+password);
        this.password = password;
    }

    public User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
