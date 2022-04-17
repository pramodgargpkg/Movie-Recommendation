package com.pkgarg.movierecommendationservice.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "user")
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private List<Object> showList;

    public User(String id, String name, String email, String password, List<Object> showList) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.showList = showList;
    }

    public User() {
    }


    public String getId() {
        return id;
    }

    public void setId(String userId) {
        this.id = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Object> getShowList() {
        return showList;
    }

    public void setShowList(List<Object> showList) {
        this.showList = showList;
    }
}
