package com.gry.presys.controller;

import com.gry.presys.constants.MessageConstants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping
    public String home() {
        return MessageConstants.NOTHING_HERE;
    }

}
