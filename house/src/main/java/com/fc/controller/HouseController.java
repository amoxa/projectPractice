package com.fc.controller;

import com.fc.entity.HouseList;
import com.fc.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("house")
public class HouseController {

    @Autowired
    HouseService houseService;

    @RequestMapping("showHouseList")
    public String queryAllHouse(Model model){
        List<HouseList> houseLists = houseService.queryAllHouse();

        model.addAttribute("houselists", houseLists);
        model.addAttribute("mainPage", "ahouselist.jsp");

        return "admin/main1.jsp";
    }


    @RequestMapping("houseInfo")
    public String findById(HouseList houseList, Model model){
        houseService.findById(houseList);

        model.addAttribute("houselist", houseList);
        model.addAttribute("mainPage", "changehouse.jsp");

        return "admin/main1.jsp";
    }

    @RequestMapping("houseUpdate")
    public String updateHouse(HouseList houseList, Model model){
        houseService.updateHouse(houseList);
        return queryAllHouse(model);
    }

    @RequestMapping("deleteHouse")
    public String deleteHouse(Integer id, Model model){
        if (houseService.deleteHouse(id) == 1){
            return queryAllHouse(model);
        }
        model.addAttribute("error", "error");
        return queryAllHouse(model);
    }

    @RequestMapping("toaddhouse")
    public String toAddHouse(Model model){
        model.addAttribute("mainPage", "addhouse.jsp");
        return "admin/main1.jsp";
    }

    @RequestMapping("addhouse")
    public String addHouse(HouseList houseList, Model model){
        String error = "error";
        if (houseService.addHouse(houseList) == 1){
            error = "succeed!";
        }
        model.addAttribute("mainPage", "addhouse.jsp");
        model.addAttribute("error", error);
        return "admin/main1.jsp";
    }
}
