package com.example.todo.controller.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


    // アノテーションが付与できる場所を表す（メソッド　フィールド）
    @Target({ElementType.METHOD, ElementType.FIELD})
    // アノテーションをどの段階まで残すか（実行時まで）
    @Retention(RetentionPolicy.RUNTIME)
    //　バリデーションを実行するクラスを指定
    @Constraint(validatedBy = UniqueUsernameValidator.class)

    //　アノテーションの作成
    public @interface UniqueUsername {
        String message() default "入力されてたユーザー名はすでに登録されています。別のユーザー名を入力してください";
        Class<?>[] groups() default {};
        Class<? extends Payload>[] payload() default {};
    }
