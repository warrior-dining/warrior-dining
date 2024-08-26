package warriordining.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/review")
public class ReviewController {

    @GetMapping("/management")
    public String managerReviewManagement() {
        return "/review/managerReviewManagement";
    }

    @GetMapping("/restaurantReviewList")
    public String restaurantReviewList() {
        return "/review/restaurantReviewList";
    }

    @GetMapping("/comment")
    public String reviewComment() {
        return "/review/reviewComment";
    }

    @GetMapping("/new")
    public String reviewCreate() {
        return "/review/reviewCreate";
    }

    @GetMapping("/edit")
    public String reviewEdit() {
        return "/review/reviewEdit";
    }

}
