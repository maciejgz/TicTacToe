package pl.mg.ttt.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.mg.ttt.web.formobject.StartGameFormPojo;

/**
 * Created by m on 2016-01-24.
 */

@Controller
public class GameController {

    @RequestMapping(value = "/new_game", method = RequestMethod.POST)
    public ModelAndView newGame(final StartGameFormPojo startGameFormPojo) {
        System.out.println(startGameFormPojo);
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("game");
        return modelAndView;
    }
}
