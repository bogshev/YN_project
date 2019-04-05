package com.example.yes_no.Identificator;
import com.example.yes_no.domain.VoterController;
import java.util.ArrayList;



public class IDController {
    VoterController voterController = new VoterController();
    ArrayList<Integer> IDList = new ArrayList<>();

    int id = 0;
    boolean voted =false;

    public void createID(){
        id = (int) Math.floor(Math.random());
        IDList.add(id);
        System.out.println("new user " + id);

    }

    public void yesID(){
        if(IDList.contains(id)) {
            if (voted == true) {
                System.out.println("this user already tried to vote");

            }
            else {
                voterController.yplusplus();
                voted = true;

            }
        }
        else{

        }

    }

    public void noID(){
        if(IDList.contains(id)) {
            if (voted == true) {
                System.out.println("this user already tried to vote");

            }
            else {
                voterController.nplusplus();
                voted = true;

            }
        }
        else{

        }

    }



}
