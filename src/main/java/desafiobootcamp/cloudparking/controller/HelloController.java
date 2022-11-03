package desafiobootcamp.cloudparking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
test
    @GetMapping
    public String hello(){
        return "hello Dio. isso vai me dar uma vaga";
    }
}
