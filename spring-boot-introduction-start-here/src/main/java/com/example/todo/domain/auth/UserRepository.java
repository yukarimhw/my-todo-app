package com.example.todo.domain.auth;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserRepository {
    //usernameと一致するユーザー情報を全て取り出す
    @Select("select * from users where username = #{username}")
    Optional<User> findByUsername(String username);

    // ユーザー情報を全件取得する
    @Select("select * from users")
    List<User> findAll();

    //　ユーザー情報の登録
    @Insert("insert into users (username, password, authority) values(#{username}, #{password}, #{authority})")
    void insert(String username, String password,String authority);
}
