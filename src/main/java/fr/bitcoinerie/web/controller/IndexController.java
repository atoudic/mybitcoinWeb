package fr.bitcoinerie.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @RequestMapping({"/","/index"})
    public String index() {
         return "index";
    }


    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello world";
    }

}