package com.example.test.controller;


import com.example.test.model.Weapon;
import com.example.test.repository.WeaponRepository;
import com.example.test.service.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class WebController {
    WeaponService weaponService;

    @GetMapping("/")
    public String getAllWeapon( Model model) {
        List<Weapon> weaponList = weaponService.listAll();
//        model.addAttribute("weapons", weaponList);
        return "index";
    }

}
