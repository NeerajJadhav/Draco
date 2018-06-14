package hello;

import com.mongodb.MongoCredential;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;


@Configuration
public class AppConfig {

    /*
     * Factory bean that creates the com.mongodb.MongoClient instance
     */
    public @Bean
    MongoClientFactoryBean mongo() {

        MongoCredential[] mongoCredentials = new MongoCredential[1];
        mongoCredentials[0] = MongoCredential.createScramSha1Credential("admin", "heroku_vqnz6w17", "password".toCharArray());

        MongoClientFactoryBean mongo = new MongoClientFactoryBean();
        mongo.setHost("ds049171.mlab.com");
        mongo.setPort(49171);
        mongo.setCredentials(mongoCredentials);
        return mongo;
    }
}

