package me.yes.googleoauth;

import me.yes.googleoauth.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class GoogleoauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoogleoauthApplication.class, args);
    }

}
