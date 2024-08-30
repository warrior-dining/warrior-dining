package warriordining.controller.ownerController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owner")
public class ownerController {

    @GetMapping("/main")
    public String ownerPage() {
        return "owner/ownerPage";
    }
}
