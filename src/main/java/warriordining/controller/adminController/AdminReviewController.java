package warriordining.controller.adminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/review")
public class AdminReviewController {

    @GetMapping("/list")
    public String detail() {
        return "/admin/review/list";
    }

    @GetMapping("/detail")
    public String 음식점으로보내기() {
        return "/review/reviewComment";
    }
}
