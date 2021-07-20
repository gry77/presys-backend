package com.gry.presys.controller;

import com.gry.presys.model.COAResponse;
import com.gry.presys.service.CoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    CoaService coaService;

    @GetMapping
    public String home() {
        return "OK";
    }

    @GetMapping("/coa")
    public ResponseEntity<COAResponse> getAllCoa() {
        return new ResponseEntity<>(coaService.getAllCoa(), HttpStatus.OK);
    }
}
