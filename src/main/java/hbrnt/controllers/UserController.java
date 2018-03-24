package hbrnt.controllers;

import hbrnt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "")
    public ModelAndView getUser(Model model){
        return new ModelAndView("pages",
                "user",userService.findUser(1));
    }
}
