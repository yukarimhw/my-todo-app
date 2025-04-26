package com.example.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller("/")
public class indexController {

      // http:localhost:8080/ -> "Hello, World!"
      // GET / -> "Hello World"
      @GetMapping
      public String index() {
          return "index";
      }

    //　/loginにGetメソッドが来たらログインページを表示
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    // ログアウトページの表示
    @GetMapping("/logout")
    public String showLogoutForm() {
        return "logout";
    }
}
