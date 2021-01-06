package com.dojosurvey.dojo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import javax.servlet.http.PushBuilder;
import javax.swing.text.html.Option;

@Controller
public class Home {
    @RequestMapping("/")
    public String homecontrol() {
        return "home.jsp";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam  String name, @RequestParam String location, @RequestParam String Language , @RequestParam(required = false) String comment, HttpSession session){
        session.setAttribute("name",name);
        session.setAttribute("location",location);
        session.setAttribute("Language",Language);
        session.setAttribute("comment",comment);
        return "redirect:/displayinfo";
    }
    @RequestMapping("/displayinfo")
    public String displayInfo(HttpSession session){

        return "display.jsp";
    }
}

