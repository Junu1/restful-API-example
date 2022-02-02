package com.example.restful.service.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "student")
public class StudentController {
    @GetMapping(value = "example")
    public List<String> getAllStudent() {
        String str = null;
        str.toLowerCase();
        return Arrays.asList("Junu", "Anisha");
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student) {
        student.setId(1);
        return student;
    }

    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleError(NullPointerException e) {
        ErrorResponse errorResponse = new ErrorResponse(false, "Internal Server Error");
        log.error("Error result : {}", errorResponse);
        return errorResponse;
    }
}
