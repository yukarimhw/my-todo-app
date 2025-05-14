package com.example.todo.controller.validation;

import com.example.todo.domain.auth.UserRepository;
import lombok.RequiredArgsConstructor;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

// 名前の重複を防ぐ
@RequiredArgsConstructor
//　第一引数：アノテーションのタイプ　第二引数：バリデーション対象のオブジェクトの型（username）
public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String> {

    private final UserRepository userRepository;
    @Override
    /* 値がバリデーションに合格しているか判定
       入力された値がデータベースに存在しなければture */
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        return userRepository.findByUsername(value).isEmpty();
    }
}
