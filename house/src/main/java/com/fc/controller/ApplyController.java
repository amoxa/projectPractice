package com.fc.controller;

import com.fc.entity.Apply;
import com.fc.service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("apply")
public class ApplyController {

    @Autowired
    ApplyService applyService;

    @RequestMapping("findAllApply")
    public String findAllApply(Model model){

        List<Apply> applyList = applyService.findAllApply();

        model.addAttribute("applylist", applyList);

        model.addAttribute("mainPage", "applylist.jsp");

        return "admin/main1.jsp";
    }


}
