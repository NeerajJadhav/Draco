package com.artalos.gameon.model;

import com.artalos.gameon.domain.User;
import com.artalos.gameon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserModelImpl implements UserModel {

    @Autowired
    private UserRepository repository;

    @Override
    public User createUser(User user) {
        return repository.save(user);
    }

    @Override
    public User findUserById(String userId) {
        return repository.findUserByUserId(userId);
    }

    @Override
    public User findUserByUsername(String userName) {
        System.out.println("In UserModelImpl: " + userName);
        return repository.findUserByUserName(userName);
    }

    @Override
    public User findUserByCredentials(String userName, String password) {
        return repository.findUserByUserNameAndPassword(userName, password);
    }

    @Override
    public User updateUser(User user) {
        return repository.save(user);
    }

    @Override
    public Boolean deleteUser(String userId) {
        repository.deleteById(userId);
        return !repository.existsById(userId);
    }


    @Override
    public List<User> searchUsers(String searchWord) {
        //TODO: Fix SearchUsers functionality
        return repository.findAll();
    }
}
