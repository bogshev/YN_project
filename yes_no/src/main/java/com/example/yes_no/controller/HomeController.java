package com.example.yes_no.controller;

import com.example.yes_no.Identificator.IDController;
import com.example.yes_no.command.ShellController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
/*@RequestMapping("home")*/
public class HomeController {


    @Autowired
    ShellController shell;

    @RequestMapping(value = "yes" , method = RequestMethod.GET)
    public String getYes(){
        shell.yes();
        System.out.println("voted yes");
        return "index";

    }

    @RequestMapping(value = "no" , method = RequestMethod.GET)
    public String getNo(){
        shell.no();
        System.out.println("voted no");
        return "index";

    }


//    @RequestMapping(value = "id" , method = RequestMethod.GET)
//    public String getID(){
//        System.out.println("last user " + getID());
//        return "index";
//
//    }

//    @RequestMapping(value = "reset" , method = RequestMethod.GET)
//    public String getReset(){
//        shell.reset();
//        System.out.println("votes set to 0");
//        return "index";
//
//    }
}
