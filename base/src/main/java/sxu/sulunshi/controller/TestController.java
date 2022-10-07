package sxu.sulunshi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("hello")
    public String hello(){
        System.out.println("666");
        System.out.println("password");
        System.out.println("i dont think so");
        System.out.println("i just think so");
        System.out.println("6");


        return "hello security";
    }
}
