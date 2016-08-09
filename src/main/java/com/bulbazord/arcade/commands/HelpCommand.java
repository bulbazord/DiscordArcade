package com.bulbazord.arcade.command;

import net.dv8tion.jda.events.message.MessageReceivedEvent;
import net.dv8tion.jda.entities.MessageChannel;

public class HelpCommand extends Command {
    public String getHelpMessage() {
        // Find a nice way to automate this
       return "\n--- Commands ---\n"
            + "$help -- Returns this help message\n"
            + "$quit -- Forces the bot to quit";

    }
    public void executeCommand(MessageReceivedEvent event) {
        MessageChannel chan;
        if (event.isPrivate()) {
            chan = event.getPrivateChannel();
        } else {
            chan = event.getTextChannel();
        }
        chan.sendMessage(getHelpMessage());
    }
}
