package com.bulbazord.arcade;

import com.bulbazord.arcade.command.*;

import java.util.HashMap;

import net.dv8tion.jda.events.message.MessageReceivedEvent;
import net.dv8tion.jda.hooks.ListenerAdapter;


public class CommandListener extends ListenerAdapter {

    private HashMap<String, Command> commandMap;

    public CommandListener() {
        commandMap = new HashMap<>();
        commandMap.put("$help", new HelpCommand());
        commandMap.put("$quit", new QuitCommand());
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        String[] msg = event.getMessage().getContent().split(" ");
        if (msg[0].charAt(0) == '$') {
            Command command = commandMap.get(msg[0]);
            if (command == null) {
                event.getChannel().sendMessage("Error, did not recognize the command " + msg[0]);
            } else {
                command.executeCommand(event);
            }
        }
    }
}
