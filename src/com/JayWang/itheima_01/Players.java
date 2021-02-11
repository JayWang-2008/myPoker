package com.JayWang.itheima_01;

import java.util.ArrayList;

public class Players {
    ArrayList<String> player1 = new ArrayList<>();
    ArrayList<String> player2 = new ArrayList<>();
    ArrayList<String> player3 = new ArrayList<>();
    ArrayList<String> under = new ArrayList<>();
    public Players(){
        addPlayersPokers();
    }
    private void addPlayersPokers(){
        Judge j = new Judge();
        for(int i = 0;i < j.getPokers().size();i ++){
            String poker = j.getPokers().get(i);
            ArrayList<String> pokersArray = j.getPokers();
            if(i >= pokersArray.size()-3){
                under.add(poker);
            }
            else if(i%3 == 0){
                player1.add(poker);
            }
            else if(i%3 == 1){
                player2.add(poker);
            }
            else if(i%3 == 2){
                player3.add(poker);
            }
        }
    }
}
