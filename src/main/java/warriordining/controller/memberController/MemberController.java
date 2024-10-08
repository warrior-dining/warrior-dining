package warriordining.controller.memberController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/login")
    public String login() {
        return "/member/login";
    }

    @GetMapping("/new")
    public String create() {
        return "/member/create";
    }

}
