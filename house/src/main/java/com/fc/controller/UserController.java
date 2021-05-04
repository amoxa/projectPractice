package com.fc.controller;

import com.fc.entity.User;
import com.fc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("login")
    public String userLogin(User demo, HttpSession session, Model model){

        User user = userService.userLogin(demo);
        if (user != null){
            session.setAttribute("user", user);
            if (user.getType().equals("admin")){
                System.out.println(user);
                return "admin/main1.jsp";
                    }else {
                return "zuke/main.jsp";
            }

        }else {
            model.addAttribute("error", "error");
            return "../../index.jsp";
        }
    }

    @RequestMapping("logout")
    public String userLogout(HttpSession session){
        session.removeAttribute("user");

        return "../../index.jsp";
    }
}
