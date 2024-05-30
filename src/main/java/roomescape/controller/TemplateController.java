package roomescape.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TemplateController {
    @GetMapping(value = "/")
    public String home() {
        return "home";
    }

    @GetMapping(value = "/reservation")
    public String reservation() {
        return "new-reservation";
    }

    @GetMapping(value =  "/time")
    public String time() {
        return "time";
    }
}