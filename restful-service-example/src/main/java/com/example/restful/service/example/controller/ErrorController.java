package com.example.restful.service.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "exception")
public class ErrorController {

    @RequestMapping(value = "exception1", method = RequestMethod.GET)
    public int divide() {
        int res = 10 / 0;
        return res;
    }

    @RequestMapping(value = "exception2", method = RequestMethod.GET)
    public int array() {
        int a[] = new int[5];
        return a[10] = 50;
    }

    @RequestMapping(value = "exception3", method = RequestMethod.GET)
    public List<String> getAllEmployee() {
        String str = null;
        str.toLowerCase();
        return Arrays.asList("Junu", "Anisha");
    }

    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    String handleArrayOutOfBoundException(ArrayIndexOutOfBoundsException exception) {
        log.error(exception.getMessage());
        return "Array Out Of Bound Exception";
    }

    @ExceptionHandler(ArithmeticException.class)
    String handleArithmeticException(ArithmeticException exception) {
        log.error(exception.getMessage());
        return "Arithmetic Exception";
    }

    @ExceptionHandler(NullPointerException.class)
    String handleNullPointerException(NullPointerException exception) {
        log.error(exception.getMessage());
        return "Null Pointer Exception";
    }

}
