package com.example.todo.controller.user;

import com.example.todo.controller.validation.UniqueUsername;
import lombok.AllArgsConstructor;
import lombok.Data;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Data
@AllArgsConstructor
//　ユーザー登録のリクエストをこのクラスのフィールドにマッピング
public class UserForm {

    @NotBlank
    @UniqueUsername
    private String username;

    @NotBlank
    @Size(min = 12, max = 128)
    private String password;

    @NotBlank
    private String authority;
}
