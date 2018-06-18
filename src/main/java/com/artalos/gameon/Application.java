package com.artalos.gameon;

import com.artalos.gameon.domain.User;
import com.artalos.gameon.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
public class Application implements CommandLineRunner {

    private final UserModel userModel;

    @Autowired
    public Application(UserModel userModel) {
        System.out.println(userModel.getClass());
        this.userModel = userModel;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {
        //userModel.deleteAll();

        // save a couple of customers
        userModel.createUser(new User("alice", "Alice", "Wonders", "alice@wonderland.com"));
        userModel.createUser(new User("bob", "Bob", "Smith", "bob@gameon.com"));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (User user : userModel.searchUsers("all")) {
            System.out.println(user);
        }
        System.out.println();

        // fetch an individual customer
        System.out.println("Customer found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(userModel.findUserByUsername("alice"));
    }
}