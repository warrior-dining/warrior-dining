package warriordining.controller.adminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/notice")
public class AdminNoticeController {

    @GetMapping("/list")
    public String list() {
        return "/admin/notice/list";
    }

    @GetMapping("/new")
    public String create() {
        return "/admin/notice/create";
    }
}
