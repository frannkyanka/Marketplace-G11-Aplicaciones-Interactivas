package com.uade.tpo.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uade.tpo.demo.service.JoyasService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("joyas")
public class JoyasController {
    private JoyasService joyasService;

    public JoyasController() {
        joyasService = new JoyasService();
    }

    @GetMapping
    public String getMethodName() {
        return new String("papoi");
    }
    

}
