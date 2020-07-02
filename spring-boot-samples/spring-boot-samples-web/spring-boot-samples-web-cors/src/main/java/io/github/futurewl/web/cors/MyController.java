package io.github.futurewl.web.cors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin
@RestController
public class MyController {

    //    @CrossOrigin
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
