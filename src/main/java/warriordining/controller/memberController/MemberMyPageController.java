package warriordining.controller.memberController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/myPage")
public class MemberMyPageController {

    @GetMapping
    public String myPage() {
        return "member/myPage/myPage";
    }

    @GetMapping("/bookmark")
    public String bookmark() {
        return "member/myPage/bookmark";
    }

    @GetMapping("/coupon")
    public String coupon() {
        return "member/myPage/coupon";
    }

    @GetMapping("/edit")
    public String edit() {
        return "member/myPage/edit";
    }
}
