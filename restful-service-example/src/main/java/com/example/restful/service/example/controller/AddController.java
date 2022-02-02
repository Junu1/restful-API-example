package com.example.restful.service.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "example")
public class AddController {
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public ResponseEntity<Integer> add() {
        int sum = 1 + 2;
        return new ResponseEntity<>(sum, HttpStatus.OK);
    }

    @GetMapping(value = "example")
    public ResponseEntity<List<String>> getAllStudent() {
        return new ResponseEntity<>(Arrays.asList("Junu", "Anisha"), HttpStatus.OK);
    }

}

