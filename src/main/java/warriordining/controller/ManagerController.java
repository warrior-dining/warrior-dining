package warriordining.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manager")
public class ManagerController {

    @GetMapping("/")
    public String managerHome() {
        return "/manager/managerHome";
    }

    @GetMapping("/notice")
    public String managerNotice() {
        return "/manager/managerNotice";
    }

    @GetMapping("/noticeCreate")
    public String managerNoticeCreate() {
        return "/manager/managerNoticeCreate";
    }

    @GetMapping("/memberList")
    public String memberList() {
        return "/manager/memberList";
    }
}
