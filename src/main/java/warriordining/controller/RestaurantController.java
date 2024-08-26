package warriordining.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/restaurant")
public class RestaurantController {

    @GetMapping("/new")
    public String restaurantCreate() {
        return "restaurant/restaurantCreate";
    }

    @GetMapping("/detail")
    public String restaurantDetail() {
        return "restaurant/restaurantDetail";
    }

    @GetMapping("/list")
    public String restaurantList() {
        return "restaurant/restaurantList";
    }

}
