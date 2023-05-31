package com.example.test.service;

import com.example.test.model.Weapon;
import com.example.test.repository.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeaponService {

    @Autowired
    private WeaponRepository weaponRepository;

    public List<Weapon> listAll(){
        return weaponRepository.findAll(Sort.by("price").ascending());
    }
}
