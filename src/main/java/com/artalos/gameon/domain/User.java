package com.artalos.gameon.domain;

import org.springframework.data.annotation.Id;

import java.sql.Date;


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

    private Date createdDate;
    private Date lastModifiedDate;


    public User() {
    }

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

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getCover() {
        return cover;
    }

    public UserType getUserType() {
        return userType;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public static class Builder {
        private String userName;
        private String password;
        private String firstName;
        private String lastName;
        private String email;
        private String cover;
        private UserType userType;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder cover(String cover) {
            this.cover = cover;
            return this;
        }

        public Builder userType(UserType userType) {
            this.userType = userType;
            return this;
        }
    }
}