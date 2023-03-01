package com.dimasev.controller;

import com.dimasev.model.Repository;
import com.dimasev.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class DController {
    @GetMapping(value="/index")
    public String loginSubmit() {
        return "index";
    }
    @GetMapping("/main_1")
    public String numAction(Model model) {
        List<User> list = Repository.getUsers();
        model.addAttribute("string", list.get(0).toString());
        model.addAttribute("string1", list.get(1).toString());
        model.addAttribute("string2", list.get(2).toString());
        model.addAttribute("string3", list.get(3).toString());
        model.addAttribute("string4", list.get(4).toString());
        return "main";
    }
}

