package com.bulbazord.arcade.command;

import net.dv8tion.jda.events.message.MessageReceivedEvent;

public abstract class Command {
    
    public abstract void executeCommand(MessageReceivedEvent event);
}
