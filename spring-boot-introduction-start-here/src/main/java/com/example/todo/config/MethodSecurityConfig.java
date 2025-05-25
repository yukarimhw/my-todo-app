package com.example.todo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

//@PreAuthorizeを有効にする
@Configuration
@EnableMethodSecurity
public class MethodSecurityConfig {
}
