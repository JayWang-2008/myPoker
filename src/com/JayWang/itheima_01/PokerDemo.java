package com.JayWang.itheima_01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Jay Wang
 *         通过程序实现斗地主过程中的洗牌
 *  *      思路：
 *  *      1.创建一个牌盒，也就是定义一个集合对象。
 *  *      2.往牌盒里装牌
 *  *      3.洗牌，也就是把牌打撒，用Collections的shuffle方法实现
 *  *      4.发牌，遍历集合，发给三个玩家牌
 *  *      5.看牌，遍历玩家自己的牌
 *
 *
 */
public class PokerDemo {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        Judge judge = new Judge();
        Players p = new Players();
        seePokers("汪泽翀",p.player1);
        seePokers("于飞",p.player2);
        seePokers("汪斌斌",p.player3);
        seePokers("底牌",p.under);
    }
    public static void seePokers(String name,ArrayList<String> player){
        System.out.println(name+"的牌为：");
        for(String poker:player){
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}

