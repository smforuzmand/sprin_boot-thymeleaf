package se.lexicon.sprin_bootthymeleaf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import se.lexicon.sprin_bootthymeleaf.model.dto.CategoryView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CategoryController {

    List<CategoryView> categoryViewList = new ArrayList<>();

    public CategoryController() {

        categoryViewList.add(new CategoryView(1, "fabrics", LocalDate.MIN));


    }

    @GetMapping("category/list")

    public String category() {


        return "category/categories-view";
    }


}
