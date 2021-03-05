package com.javainuse.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class FirstController {

    @GetMapping("/message")
    public String test() {
//        JSONObject jsonpObject = new JSONObject();
//        System.out.println(jsonpObject.toString());
        return "Hello JavaInUse Called in First Service";
    }
}