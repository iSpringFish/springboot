package cn.springfish.chapter1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Chapter1Application {

    @RequestMapping("/hi")
    public String index(){
        return "hello, this spring boot .";
    }
    public static void main(String[] args) {
        SpringApplication.run(Chapter1Application.class, args);
    }
}
