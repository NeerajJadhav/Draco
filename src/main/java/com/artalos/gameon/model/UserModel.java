package com.artalos.gameon.model;

import com.artalos.gameon.domain.User;

import java.util.List;

public interface UserModel extends Model {
    User createUser(User user);

    User findUserById(String userId);

    User findUserByUsername(String userName);

    User findUserByCredentials(String userName, String password);

    User updateUser(User user);

    Boolean deleteUser(String userId);

    List<User> searchUsers(String searchWord);

    List<User> getAllUsers();


    /*addGame();
    addLike();
    removeGame();
    removeLike();
    addFollow();
    removeFollow();
    getAllUsers();
    findUserByGoogleId();
    findUserByFacebookId();*/
    //removeInventory();
    //upsertInventory();

}
