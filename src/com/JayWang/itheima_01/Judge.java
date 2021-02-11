package com.JayWang.itheima_01;

import java.util.ArrayList;
import java.util.Collections;

public class Judge {
    private ArrayList<String> pokers = new ArrayList<>();

    public Judge() {
        String[] colors = {"♦","♣","♥","♠"};
        String[] numbers = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        for(String color : colors){
            for(String number : numbers){
                pokers.add(color+number);
            }
        }
        pokers.add("小王");
        pokers.add("大王");
        shufflePokers();
    }

    public ArrayList<String> getPokers() {
        return pokers;
    }

    public void setPokers(ArrayList<String> pokers) {
        this.pokers = pokers;
    }
    private void shufflePokers(){
        Collections.shuffle(pokers);
    }
}
