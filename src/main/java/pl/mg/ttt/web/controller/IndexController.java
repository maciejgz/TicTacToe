package pl.mg.ttt.web.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

/**
 * Created by m on 2016-01-09.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Principal principal) {
        System.out.println("/");

        System.out.println("username=" + principal.getName());

        return "index";
    }
}
