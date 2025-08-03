package org.rahmasir.learnspringsecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(registry -> {
            registry.requestMatchers("/home").permitAll();
            registry.requestMatchers("/user/**").hasRole("USER");
            registry.requestMatchers("/admin/**").hasRole("ADMIN");
            registry.anyRequest().authenticated();
        }).build();
    }
}
