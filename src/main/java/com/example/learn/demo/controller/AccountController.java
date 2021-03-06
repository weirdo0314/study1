package com.example.learn.demo.controller;

import com.example.learn.demo.modle.Account;
import com.example.learn.demo.modle.PassToken;
import com.example.learn.demo.modle.Response;
import com.example.learn.demo.service.AccountServiceImp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@Slf4j
@RestController
@RequestMapping("/index")
public class AccountController {
    @Resource
    private AccountServiceImp accountServiceImp;

    @PassToken
    @GetMapping("/login")
    Response login(@RequestParam String id, @RequestParam String password)
    {
        return accountServiceImp.login(id,password);
    }
    @PassToken
    @PostMapping("/register")
    Response rigister(@RequestBody Account account)
    {
        return accountServiceImp.rigister(account);
    }

    @GetMapping("/profile")
    String search()
    {
        return "hello word";
    }
}
