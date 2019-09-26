package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @RequestMapping("/welcome")
    public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("userName");
        String password = request.getParameter("userPassword");
        User user = new User(name, password);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("welcome.jsp");
        mv.addObject("user",user.getUserName());

        return mv;
    }
}
