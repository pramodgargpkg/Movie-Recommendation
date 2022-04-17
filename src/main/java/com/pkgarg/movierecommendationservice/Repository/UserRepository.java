package com.pkgarg.movierecommendationservice.Repository;

import com.pkgarg.movierecommendationservice.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
