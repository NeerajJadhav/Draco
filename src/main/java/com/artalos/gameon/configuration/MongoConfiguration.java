package com.artalos.gameon.configuration;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

@Configuration
public class MongoConfiguration {
    @Value("${gameon.mongodb.hostname}")
    private String hostname;

    @Value("${gameon.mongodb.database}")
    private String database;

    @Value("${gameon.mongodb.port}")
    private String port;

    @Value("${gameon.mongodb.username}")
    private String username;

    @Value("${gameon.mongodb.password}")
    private String password;

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        MongoClientURI mongoClientURI = new MongoClientURI(getMongoURI());
        MongoDbFactory mongoDbFactory = new SimpleMongoDbFactory(new MongoClient(mongoClientURI), mongoClientURI.getDatabase());
        return new MongoTemplate(mongoDbFactory);
    }

    public String getMongoURI() {
        return "mongodb://" + username + ":" + password + "@" + hostname + ":" + port + "/" + database;
    }
}

