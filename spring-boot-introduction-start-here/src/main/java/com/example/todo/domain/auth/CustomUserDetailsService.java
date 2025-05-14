package com.example.todo.domain.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor

// ユーザー情報をデータベースから取得
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;
    @Override
    // データベースに登録されているユーザーか照合
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //usernameがデータベースに登録されているか
        return userRepository.findByUsername(username)
                //一致するものが存在する場合
                .map(
                        user -> new CustomUserDetails(
                                user.getUsername(),
                                user.getPassword(),
                                //springsecurityの定義では１ユーザーが複数の権限を持つケースがあり、リストで渡す必要がある
                                toGrantedAuthorityList(user.getAuthority())
                        )
                )
                //一致するものが存在しない場合
                .orElseThrow(
                        () -> new UsernameNotFoundException(
                                "Given username is not found. (username = '" + username +"')"
                        )
                );
    }

    private List<GrantedAuthority> toGrantedAuthorityList(User.Authority authority) {
        //要素が一つのリストを生成
        return Collections.singletonList(new SimpleGrantedAuthority(authority.name()));
    }
}
