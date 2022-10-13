package se.lexicon.sprin_bootthymeleaf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {


    @RequestMapping(path = ("/"), method = RequestMethod.GET)
    public String defaultPage() {
        return "index";
    }


    @GetMapping("/homepage")
    public String homePage() {
        return "index";
    }


    @GetMapping("/custom")
    public String customMessage(Model model) {

        String message = "FromController";
        model.addAttribute("message", message);



        return "index";
    }


}
