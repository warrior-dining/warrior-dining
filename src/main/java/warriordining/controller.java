package warriordining;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/new")
    public String createForm() {
        return "memberCreate";
    }

    @GetMapping("/home2")
    public String home2() {
        return "home2";
    }

    @GetMapping("/newReview")
    public String newReview() {
        return "reviewCreate";
    }

    @GetMapping("/commentReview")
    public String commentReview() {
        return "reviewComment";
    }

    @GetMapping("/detail")
    public String detail() {
        return "restaurantDetail";
    }

    @GetMapping("/managerHome")
    public String managerHome() {
        return "managerHome";
    }

    @GetMapping("/search")
    public String search() {
        return "search";
    }

    @GetMapping("/memberList")
    public String memberList() {
        return "memberList";
    }

    @GetMapping("/restaurantList")
    public String restaurantList() {
        return "restaurantList";
    }

    @GetMapping("/faq")
    public String faq() {
        return "faq";
    }

    @GetMapping("/inquiry")
    public String inquiry() {
        return "inquiry";
    }

    @GetMapping("/myInquiry")
    public String myInquiry() {
        return "myInquiry";
    }

    @GetMapping("/restaurantCreate")
    public String restaurantCreate() {
        return "restaurantCreate";
    }

    @GetMapping("/restaurantReviewList")
    public String restaurantReviewList() {
        return "restaurantReviewList";
    }

    @GetMapping("/memberEdit")
    public String memberEdit() {
        return "memberEdit";
    }

    @GetMapping("/reviewEdit")
    public String reviewEdit() {
        return "reviewEdit";
    }

    @GetMapping("/managerNotice")
    public String managerNotice() {
        return "managerNotice";
    }

    @GetMapping("/managerNoticeCreate")
    public String managerNoticeCreate() {
        return "managerNoticeCreate";
    }

    @GetMapping("/managerInquiryDetail")
    public String managerNoticeList() {
        return "managerInquiryDetail";
    }

    @GetMapping("/managerInquiryList")
    public String managerInquiryList() {
        return "managerInquiryList";
    }

    @GetMapping("/myPage")
    public String myPage() {
        return "myPage";
    }

    @GetMapping("/memberBookmark")
    public String memberBookmark() {
        return "memberBookmark";
    }

    @GetMapping("/memberCoupon")
    public String memberCoupon() {
        return "memberCoupon";
    }
}
