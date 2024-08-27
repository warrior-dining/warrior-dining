package warriordining.controller.adminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping
    public String adminPage() {
        return "/admin/adminPage";
    }

    @GetMapping("/memberManagement")
    public String memberManagement() {
        return "/admin/memberManagement";
    }

    @GetMapping("/restaurantManagement")
    public String restaurantManagement() {
        return "/admin/restaurantManagement";
    }

    @GetMapping("reservationManagement")
    public String reservationManagement() {
        return "/admin/reservationManagement";
    }
}
