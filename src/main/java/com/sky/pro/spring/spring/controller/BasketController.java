package com.sky.pro.spring.spring.controller;

import com.sky.pro.spring.spring.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/order")
@RestController
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public List<Integer> add(@RequestParam List<Integer> ids) {
        return basketService.add(null);
    }

    @GetMapping("/get")
    private List<Integer> get() {
        return basketService.get();
    }
}


