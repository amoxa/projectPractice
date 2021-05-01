package com.fc.controller;

import com.fc.entity.User;
import com.fc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("login")
    public String userLogin(User demo, HttpSession session){

        User user = userService.userLogin(demo);
        if (user != null){
            if (user.getType().equals(demo.getType())){
                session.setAttribute("user", user);
                    }
            return "admin/main1.jsp";

        }else {
            return "../../index.jsp";
        }
    }

    @RequestMapping("logout")
    public String userLogout(User user, HttpSession session){
        session.removeAttribute("user");

        return "../../index.jsp";
    }
}
