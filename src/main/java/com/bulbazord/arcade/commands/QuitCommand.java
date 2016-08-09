package com.bulbazord.arcade.command;

import net.dv8tion.jda.events.message.MessageReceivedEvent;

public class QuitCommand extends Command {

    public void executeCommand(MessageReceivedEvent event) {
        // Add permissions stuff here, so not everybody can make the bot quit.
        // Perhaps allow for quitting not just in public channels
        if (!event.isPrivate()) {
            event.getChannel().sendMessage("Happy birthday to me!");
            event.getJDA().shutdown();
        } else {
            event.getChannel().sendMessage("Please wish me happy birthday in a public channel for now");
        }
    }
}
