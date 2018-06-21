package com.artalos.gameon.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "users")
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
    @DBRef
    private List<Game> games;
    @DBRef
    private List<Game> liked;
    @DBRef
    private List<User> following;
    @DBRef
    private List<User> followers;
    private Date createdDate;
    private Date lastModifiedDate;


    public User() {
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
                ", games=" + games +
                ", liked=" + liked +
                ", following=" + following +
                ", followers=" + followers +
                ", createdDate=" + createdDate +
                ", lastModifiedDate=" + lastModifiedDate +
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

    public List<Game> getGames() {
        return games;
    }

    public List<Game> getLiked() {
        return liked;
    }

    public List<User> getFollowing() {
        return following;
    }

    public List<User> getFollowers() {
        return followers;
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

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public void setLiked(List<Game> liked) {
        this.liked = liked;
    }

    public void setFollowing(List<User> following) {
        this.following = following;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public static Builder userBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String userName;
        private String password;
        private String firstName;
        private String lastName;
        private String email;
        private String cover;
        private UserType userType;
        private List<Game> games;
        private List<Game> liked;
        private List<User> following;
        private List<User> followers;

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

        public Builder setGames(List<Game> games) {
            this.games = games;
            return this;
        }

        public Builder setLiked(List<Game> liked) {
            this.liked = liked;
            return this;
        }

        public Builder setFollowing(List<User> following) {
            this.following = following;
            return this;
        }

        public Builder setFollowers(List<User> followers) {
            this.followers = followers;
            return this;
        }

        public User build() {
            User user = new User();
            user.setUserName(this.userName);
            user.setLastName(this.lastName);
            user.setFirstName(this.firstName);
            user.setCover(this.cover);
            user.setEmail(this.email);
            user.setPassword(this.password);
            user.setUserType(this.userType);
            user.setGames(this.games);
            user.setLiked(this.liked);
            user.setFollowers(this.followers);
            user.setFollowing(this.following);
            return user;
        }
    }
}