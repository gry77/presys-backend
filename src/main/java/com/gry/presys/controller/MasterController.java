package com.gry.presys.controller;

import com.gry.presys.constants.MessageConstants;
import com.gry.presys.model.COA;
import com.gry.presys.service.CoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/master")
public class MasterController {

    public static final String PATH_COA = "coa";

    @Autowired
    CoaService coaService;

    @GetMapping
    public String home() {
        return MessageConstants.NOTHING_HERE;
    }

    @GetMapping(PATH_COA)
    public ResponseEntity<COA> getAllCoa() {
        return new ResponseEntity<>(coaService.getAllCoa(), HttpStatus.OK);
    }

    @PostMapping(PATH_COA)
    public ResponseEntity<COA> updateCOA() {
        return new ResponseEntity<>(coaService.getAllCoa(), HttpStatus.OK);
    }
}
