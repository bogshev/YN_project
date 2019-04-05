package com.example.yes_no.command;

import com.example.yes_no.Identificator.IDController;
import com.example.yes_no.domain.VoterController;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class ShellController {
    VoterController voterController = new VoterController();
    IDController idController = new IDController();

    @ShellMethod("results")
    public void results(){
        voterController.toString();
        System.out.println(voterController.toString());
    }
    @ShellMethod("yes")
    public void yes(){
        voterController.yplusplus();
    }

    @ShellMethod("no")
    public void no(){
        voterController.nplusplus();
    }

    @ShellMethod("reset")
    public void reset() {
        voterController.reset();
        System.out.println(voterController.reset());
    }


}
