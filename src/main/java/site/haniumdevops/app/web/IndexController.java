package site.haniumdevops.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/logging")
    public String logging() {
        return "logging";
    }

    @GetMapping("/monitoring")
    public String monitoring() {
        return "monitoring";
    }
}
