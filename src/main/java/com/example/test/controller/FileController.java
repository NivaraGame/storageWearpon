package com.example.test.controller;

import com.example.test.repository.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FileController {

    @Autowired
    private WeaponRepository weaponRepository;



}
