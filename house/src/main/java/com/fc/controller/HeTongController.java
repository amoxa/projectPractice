package com.fc.controller;

import com.fc.entity.Hetong;
import com.fc.service.HeTongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hetong")
public class HeTongController {
    @Autowired
    HeTongService hetongService;

    @RequestMapping("showHeTong")
    public String showHeTong(String house_id, Model model){

        Hetong hetong = hetongService.findHeTongByHouseId(house_id);

        model.addAttribute("hetong", hetong);
        model.addAttribute("mainPage", "hetong.jsp");

        return "admin/main1.jsp";
    }

    @RequestMapping("deleteHeTong")
    public String deleteHeTong(String id, Model model){
        hetongService.deleteHeTong(id);

        model.addAttribute("error", "deleted successfully.");

        model.addAttribute("mainPage", "applylist.jsp");

        return "admin/main1.jsp";
    }
}
