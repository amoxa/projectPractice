package com.fc.controller;

import com.fc.entity.Zulist;
import com.fc.service.ZuListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("zu")
public class ZuListController {
    @Autowired
    ZuListService zuListService;

    @RequestMapping("toZuList")
    public String toZuList(Model model){

        List<Zulist> zuList = zuListService.findZuUserList();

        model.addAttribute("mainPage", "zulist.jsp");

        model.addAttribute("zulist", zuList);

        return "admin/main1.jsp";
    }



}
