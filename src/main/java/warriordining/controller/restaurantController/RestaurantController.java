package warriordining.controller.restaurantController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/restaurant")
public class RestaurantController {

    @GetMapping("/new")
    public String create() {
        return "restaurant/create";
    }

    @GetMapping("/detail")
    public String detail() {
        return "restaurant/detail";
    }
}
