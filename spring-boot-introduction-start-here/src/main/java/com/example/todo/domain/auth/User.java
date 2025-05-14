package com.example.todo.domain.auth;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class User {
    private String username;
    private String password;
    private Authority authority;

    public enum Authority {
        ADMIN,
        USER,
    }
}
