package warriordining;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/managerReviewManagement")
    public String managerReviewDetail() {
        return "review/managerReviewManagement";
    }

    @GetMapping("/asd")
    public String asd() {
        return "monthBest";
    }
}
