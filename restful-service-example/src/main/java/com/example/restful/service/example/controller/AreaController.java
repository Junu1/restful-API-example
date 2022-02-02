package com.example.restful.service.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "area")
public class AreaController {
    @RequestMapping(value = "rectangle", method = RequestMethod.GET)
    public int area() {
        return 1;
    }

    @PostMapping(value = "addition")
    public int add(@RequestBody Calc calc) {
        int sum = calc.getA() + calc.getB();
        return sum;
    }

    @RequestMapping(value = "simplify/{a}/{b}/{c}", method = RequestMethod.GET)
    public int simplify(@PathVariable int a, @PathVariable int b, @PathVariable int c) {
        log.info("Path variable:a {},b {},c {}", a, b, c);
        int result = a + b - c;
        return result;
    }

    @RequestMapping(value = "perimeter/{a}/{b}", method = RequestMethod.GET)
    public int perimeter(@PathVariable(name = "a", required = false) int l, @PathVariable(value = "b") int b) {
        log.info("Path variable:a {},b {}", l, b);
        int result = 2 * (l + b);
        return result;
    }

    @RequestMapping(value = "greet", method = RequestMethod.GET)
    public String greeting(@RequestParam(name = "name", defaultValue = "Junu") String name) {
        return "Hello" + " " + name;
    }
}
