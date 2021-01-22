package com.thekingelessar.lobbyjoindisable;

import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LobbyChatHandler
{
    
    @SubscribeEvent (priority = EventPriority.NORMAL, receiveCanceled = true)
    public void onEvent(ClientChatReceivedEvent chatEvent)
    {
        String fullMessage = chatEvent.message.getUnformattedText();
        if (fullMessage.contains("joined the lobby!") || fullMessage.contains("sled into the lobby!"))
        {
            chatEvent.setCanceled(true);
        }
    }
    
}