package pl.mg.ttt.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by m on 2016-01-10.
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        System.out.println("/login");
        return "login";
    }

    @RequestMapping("/logout")
    public String logout(){
        System.out.println("/logout");
        return "/";
    }

}
