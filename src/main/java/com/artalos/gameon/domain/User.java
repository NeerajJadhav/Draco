package com.artalos.gameon.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

public class User {
    //var userSchema = mongoose.Schema({
    //            username: {type: String, unique: true, required: true},
    //        password: {type: String},
    //        firstName: String,
    //        lastName: String,
    //        email: String,
    //        cover: String,
    //        UserType: {type: String, enum: ['PLAYER', 'SELLER', 'ADMIN'], default: "PLAYER"},
    //        games: [{type: mongoose.Schema.Types.ObjectId, ref: "GameModel"}],
    //        inventory: [{
    //        _game: {type: mongoose.Schema.Types.ObjectId, ref: "GameModel"},
    //        quantity: String,
    //        price: String
    //        }],
    //        liked: [{type: mongoose.Schema.Types.ObjectId, ref: "GameModel"}],
    //        followers: [{type: mongoose.Schema.Types.ObjectId, ref: "UserModelImpl"}],
    //        following: [{type: mongoose.Schema.Types.ObjectId, ref: "UserModelImpl"}],
    //        google: {
    //        id: String,
    //        token: String
    //        },
    //        facebook: {
    //        id: String,
    //        token: String
    //        },
    //        dateCreated: {type: Date, default: Date.now}
    //        }, {collection: "user"});

    @Id
    private String userId;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String cover;
    private UserType userType;
    //private List<Game> games;

    @CreatedDate
    private String createdDate;
    @LastModifiedDate
    private String lastModifiedDate;


    public User() {}

    public User(String userName, String firstName, String lastName, String email) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", cover='" + cover + '\'' +
                ", userType=" + userType +
                ", createdDate='" + createdDate + '\'' +
                ", lastModifiedDate='" + lastModifiedDate + '\'' +
                '}';
    }
}