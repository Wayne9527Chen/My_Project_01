package com.example.my_project_01.pojo;

public class Admin {
    private String email, pass, name;

    public Admin() {
    }

    public Admin(String email, String pass, String name) {
        this.email = email;
        this.pass = pass;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
