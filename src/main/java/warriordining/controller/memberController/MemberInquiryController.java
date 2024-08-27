package warriordining.controller.memberController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/inquiry")
public class MemberInquiryController {

    @GetMapping("/faq")
    public String faq() {
        return "/member/inquiry/faq";
    }

    @GetMapping("/new")
    public String inquiry() {
        return "/member/inquiry/create";
    }

    @GetMapping("/history")
    public String myInquiry() {
        return "/member/inquiry/history";
    }
}
