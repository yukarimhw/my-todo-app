package com.example.todo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

/*
古い記述方法
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MethodSecurityConfig {
}
*/

//@PreAuthorizeを有効にする
@Configuration
@EnableMethodSecurity
public class MethodSecurityConfig {
}