package warriordining.controller.onerController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/oner")
public class onerController {

    @GetMapping("/main")
    public String onerPage() {
        return "oner/onerPage";
    }
}
