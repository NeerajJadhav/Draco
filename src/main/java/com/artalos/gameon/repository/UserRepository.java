package com.artalos.gameon.repository;

import com.artalos.gameon.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    public User findUserByUserId(String userId);

    public User findUserByUserName(String userId);

    public User findUserByUserNameAndPassword(String userName, String password);

}
