package se.lexicon.sprin_bootthymeleaf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CategoryController {


    @GetMapping("/category/list")
    public String category() {


        return "category/categories-view";

    }

}
