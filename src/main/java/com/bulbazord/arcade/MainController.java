package com.bulbazord.arcade;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import net.dv8tion.jda.JDA;
import net.dv8tion.jda.JDABuilder;

public class MainController {
    public static void main(String[] args) {
        try {
            String token = new String(Files.readAllBytes(Paths.get("TOKEN"))).trim();
            System.out.println(token);
            JDA jda = new JDABuilder().setBotToken(token).buildBlocking();
            jda.addEventListener(new CommandListener());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
