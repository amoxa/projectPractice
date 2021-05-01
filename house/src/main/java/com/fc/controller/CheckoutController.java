package com.fc.controller;

import com.fc.entity.Checkout;
import com.fc.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("check")
public class CheckoutController {
    @Autowired
    CheckoutService checkoutService;

    @RequestMapping("getAllCheckOut")
    public String getAllCheckOut(Model model){
        List<Checkout> allCheckOut = checkoutService.getAllCheckOut();

        model.addAttribute("checkout", allCheckOut);
        model.addAttribute("mainPage", "checkout.jsp");

        return "admin/main1.jsp";
    }
}
