package com.ellis.controller;

import com.ellis.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/testpage")
public class testpage {
    public String resgist (HttpSession session, HttpServletRequest request, User user){
        return "";
    }
}
