package com.bulbazord.arcade;

import net.dv8tion.jda.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.hooks.ListenerAdapter;


public class CommandListener extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] msg = event.getMessage().getContent().split(" ");
        if (msg[0].charAt(0) == '$') {
            event.getChannel().sendMessage("Received command " + msg[0]);
            System.out.printf("[%s]: Command `%s` received\n", event.getChannel().getName(), msg);
        }
    }
}
