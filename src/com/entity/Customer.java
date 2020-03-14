package com.entity;

public class Customer {

    private int customerId;
    private String name;
    private String surname;
    private String email;
    private String role;
    private String login;
    private String password;

    public Customer(int customerId, String name, String surname,
                    String email, String role, String login, String password) {
        this.customerId = customerId;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.role = role;
        this.login = login;
        this.password = password;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int id) {
        this.customerId = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
