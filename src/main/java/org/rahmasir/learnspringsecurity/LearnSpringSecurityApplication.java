package org.rahmasir.learnspringsecurity;

import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvEntry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringSecurityApplication {

    public static void main(String[] args) {

        Dotenv dotenv = Dotenv.configure().filename(".env").load();
        for (DotenvEntry entry : dotenv.entries()) {
            if (System.getProperty(entry.getKey()) == null) {
                System.setProperty(entry.getKey(), entry.getValue());
            }
        }

        SpringApplication.run(LearnSpringSecurityApplication.class, args);
    }

}
