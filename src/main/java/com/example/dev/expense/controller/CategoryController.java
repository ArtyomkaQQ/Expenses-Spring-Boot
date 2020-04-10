package com.example.dev.expense.controller;

import com.example.dev.expense.model.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @GetMapping("/categories")
    Category[] categories() {
        return Category.values();
    }

}
