package com.display.time;
import java.text.SimpleDateFormat;
import java.util.Date ;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Time {

    @RequestMapping("/time")
    public String main(Model model){
        Date dNow = new Date();
        SimpleDateFormat dateForDay = new SimpleDateFormat ("hh:mm a ");
        model.addAttribute("time",dateForDay.format(dNow));
        return "time.jsp";
    }
}

