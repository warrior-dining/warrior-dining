package warriordining.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

    @GetMapping("login")
    public String memberLogin() {
        return "member/login";
    }

    @GetMapping("bookmark")
    public String memberBookmark() {
        return "member/memberBookmark";
    }

    @GetMapping("/coupon")
    public String memberCoupon() {
        return "member/memberCoupon";
    }

    @GetMapping("new")
    public String memberCreate() {
        return "member/memberCreate";
    }

    @GetMapping("edit")
    public String memberEdit() {
        return "member/memberEdit";
    }

    @GetMapping("myPage")
    public String memberMyPage() {
        return "member/myPage";
    }
}
