package com.example.todo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers(new AntPathRequestMatcher("/login/**")).permitAll()   // /login以下は認証不要
                        .anyRequest().authenticated()           // それ以外は認証必要
                )
                .formLogin(form -> form
                        .loginPage("/login")                    // ログインページのURLは /login
                );

        return http.build();
    }
}
