package test;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test() {
        return "hello world";
    }
}
