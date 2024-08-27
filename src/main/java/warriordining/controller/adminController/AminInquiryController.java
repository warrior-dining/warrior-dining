package warriordining.controller.adminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/inquiry")
public class AminInquiryController {

    @GetMapping("/detail")
    public String detail() {
        return "admin/inquiry/detail";
    }

    @GetMapping("/list")
    public String list() {
        return "admin/inquiry/list";
    }
}
