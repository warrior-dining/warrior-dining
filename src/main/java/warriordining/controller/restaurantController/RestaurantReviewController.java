package warriordining.controller.restaurantController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/restaurant/review")
public class RestaurantReviewController {

    @GetMapping("/new")
    public String create() {
        return "restaurant/review/create";
    }

    @GetMapping("/edit")
    public String edit() {
        return "restaurant/review/edit";
    }

    @GetMapping("/list")
    public String list() {
        return "restaurant/review/list";
    }

    @GetMapping("/comment")
    public String comment() {
        return "restaurant/review/comment";
    }
}
