package com.pkgarg.movierecommendationservice.Service;

import com.pkgarg.movierecommendationservice.Model.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    User findById(String id);

    void save(User user);

    void deleteById(String id);

    void updateUser(User user);
}
