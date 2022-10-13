package se.lexicon.sprin_bootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.time.LocalDate;

@Controller
public class DashboardController {


    @RequestMapping("/dashboard")
    public String dashboard(Model model) {


        LocalDate currentDate = LocalDate.now();
        model.addAttribute("serverDate", currentDate);
        model.addAttribute("productListSize", 65);
        model.addAttribute("categoryListSize", 25);
        model.addAttribute("userListSize", 25);

        return "dashboard";
    }
}
