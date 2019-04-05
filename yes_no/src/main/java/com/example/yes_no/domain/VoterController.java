package com.example.yes_no.domain;

public class VoterController {
    int y = 0;
    int n = 0;


    public void yplusplus(){
            y++;

    }

    public void nplusplus(){
            n++;

    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Results{" +
                "y=" + y +
                ", n=" + n +
                '}';
    }

    public String reset(){
        y = 0;
        n = 0;
        return "Results{" +
                "y=" + y +
                ", n=" + n +
                '}';
    }



}
