package warriordining.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/monthBest")
    public String monthBest() {
        return "monthBest";
    }

    @GetMapping("/search")
    public String search() {
        return "search";
    }
}
