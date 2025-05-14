package com.example.todo.controller.user;

import com.example.todo.domain.auth.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserControlloer {

    private final UserService userService;

    @GetMapping
    // ユーザーリスト一覧取得
    public  String showList(Model model) {
        model.addAttribute("userList", userService.findAll());
        return "users/list";
    }

    //　ユーザー作成画面へ
    @GetMapping("/creationForm")
    public String showCreationForm(@ModelAttribute UserForm form) {
        return "users/creationForm";
    }

    //ユーザー登録した後の画面遷移
    @PostMapping
    public String create(@Validated UserForm form, BindingResult bindingResult) {
        //　バリデーションエラー発生時、ユーザー作成処理を打ち切る(一覧画面ではなく、作成画面に戻す)
        if (bindingResult.hasErrors()) {
            return showCreationForm(form);
        }

        // ユーザー情報登録
        userService.create(form.getUsername(), form.getPassword(), form.getAuthority());

        return "redirect:/users";
    }

}
