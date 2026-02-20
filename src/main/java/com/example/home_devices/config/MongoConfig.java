package com.example.home_devices.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class MongoConfig {

    @Bean
    public MongoClient mongoClient() {
        // BURAYA Atlas'tan aldığın linki tam olarak (şifrenle beraber) yapıştır
        return MongoClients.create("mongodb+srv://gogtug033_db_user:T9WqBsmREeVZi3rT@springchallange.kzcqito.mongodb.net/home_devices?retryWrites=true&w=majority");
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        // Veritabanı ismini ("home_devices") burada manuel olarak mühürlüyoruz
        return new MongoTemplate(new SimpleMongoClientDatabaseFactory(mongoClient(), "home_devices"));
    }
}