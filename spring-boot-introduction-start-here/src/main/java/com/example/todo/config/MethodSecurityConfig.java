package com.example.todo.config;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

//@PreAuthorizeを有効にする
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MethodSecurityConfig {
}
