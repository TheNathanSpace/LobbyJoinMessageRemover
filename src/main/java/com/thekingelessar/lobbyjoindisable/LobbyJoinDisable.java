package com.thekingelessar.lobbyjoindisable;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod (modid = LobbyJoinDisable.MODID, version = LobbyJoinDisable.VERSION)
public class LobbyJoinDisable
{
    public static final String MODID = "lobbyjoindisable";
    public static final String VERSION = "1.0";
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent e)
    {
        MinecraftForge.EVENT_BUS.register(this);
        FMLCommonHandler.instance().bus().register(this);
        
        MinecraftForge.EVENT_BUS.register(new LobbyChatHandler());
    }
    
}
