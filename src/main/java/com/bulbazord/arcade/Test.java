package com.bulbazord.arcade;

import net.dv8tion.jda.JDA;
import net.dv8tion.jda.JDABuilder;

public class Test {
    public static void main(String[] args) {
        System.out.println("start");
        try {
            JDA jda = new JDABuilder().setBotToken("token").buildBlocking();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("donezo");
    }
}
