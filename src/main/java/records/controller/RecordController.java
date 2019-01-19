package records.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import records.services.RecordService;

@RequestMapping("/")
@Controller
public class RecordController {

    @Autowired
    RecordService recordService;

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
