package warriordining.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inquiry")
public class InquiryController {

    @GetMapping("/")
    public String faq() {
        return "/inquiry/faq";
    }

    @GetMapping("/inquiry")
    public String inquiry() {
        return "/inquiry/inquiry";
    }

    @GetMapping("/managerInquiryDetail")
    public String managerInquiryDetail() {
        return "/inquiry/managerInquiryDetail";
    }

    @GetMapping("/managerInquiryList")
    public String managerInquiryList() {
        return "/inquiry/managerInquiryList";
    }

    @GetMapping("/myInquiry")
    public String myInquiry() {
        return "/inquiry/myInquiry";
    }
}
