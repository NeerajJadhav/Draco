package hello;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import static java.util.Collections.singletonList;

@Configuration
public class MongoConfig {

    /*
     * Factory bean that creates the com.mongodb.MongoClient instance
     */
    /*@Bean
    public MongoClientFactoryBean mongo() {

        MongoCredential mongoCredential = MongoCredential.createScramSha1Credential("draco", "heroku_vqnz6w17", "pass@123".toCharArray());

        MongoClientFactoryBean mongo = new MongoClientFactoryBean();
        mongo.setHost("ds049171.mlab.com");
        mongo.setPort(49171);
        mongo.setCredentials(new MongoCredential[]{mongoCredential});
        System.out.println(mongo);
        return mongo;
    }*/

    /*@Bean
    public MongoClient mongoClient() {
        MongoClientURI mongoClientURI = new MongoClientURI("mongodb://draco:pass123@ds049171.mlab.com:49171/heroku_vqnz6w17");
        return new MongoClient(mongoClientURI);
    }*/


    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        MongoClientURI mongoClientURI = new MongoClientURI("mongodb://draco:pass123@ds049171.mlab.com:49171/heroku_vqnz6w17");
        MongoDbFactory mongoDbFactory = new SimpleMongoDbFactory(new MongoClient(mongoClientURI), "heroku_vqnz6w17");
        return new MongoTemplate(mongoDbFactory);
    }
}

