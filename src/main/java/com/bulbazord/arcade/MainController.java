package com.bulbazord.arcade;

import net.dv8tion.jda.JDA;
import net.dv8tion.jda.JDABuilder;

public class MainController {
    public static void main(String[] args) {
        try {
            JDA jda = new JDABuilder().setBotToken("TOKEN").buildBlocking();
            jda.addEventListener(new CommandListener());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
