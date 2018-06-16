package net.shipovalov.training.model;

public class UserData {
    private  String username;
    private  String password;


    public UserData withUserName(String name){
        this.username = name;
        return this;
    }

    public UserData withUserPassword(String password){
        this.password = password;
        return this;
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
