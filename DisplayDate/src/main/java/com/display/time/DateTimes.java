package com.display.time;
import java.text.SimpleDateFormat;
import java.util.* ;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DateTimes {
        @RequestMapping("/date")

        public String main(Model model){
            Date dNow = new Date( );
            SimpleDateFormat dateForDay = new SimpleDateFormat ("EEEEEEE', the' dd 'of' MMMMMM ','yyyy ");
            model.addAttribute("date",dateForDay.format(dNow));
            return "date.jsp";
        }

    }

