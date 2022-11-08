package com.qxf.springbootstudy01.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qxf.springbootstudy01.pojo.User;
import com.qxf.springbootstudy01.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import java.sql.Wrapper;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @describe TODO
 * @Author Mr.Q
 * @Date 2022/11/4 15:27
 */
@Controller
public class UserController {


    @Resource
    UserService userService;

    @GetMapping("/login")
    public String goLogin() {
        return "login";
    }

    @PostMapping("/dologin")
    public String login(Integer age, User user, Model model) {
        if (age.equals(user.getAge())) {
            QueryWrapper<User> wrapper = new QueryWrapper<>();
            wrapper
                    .orderByAsc("id");
            model.addAttribute("user", userService.list(wrapper));
            System.out.println("user = " + user);
            System.out.println("登录成功！");
            System.out.println("登录失败！");
            System.out.println("hot fix 第一次修改！");
            System.out.println("hot fix 第二次修改！");
            System.out.println("push test！");
            return "index";
        } else {
            return "login";
        }

    }


}
