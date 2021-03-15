package com.adibuda.bot;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class BozoEvent extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent e){
        String s = e.getMessage().getContentStripped().toLowerCase();
        String[] adi, nikhil, anish, arnav, devansh, abhi, saketh, kavin;
        adi = new String[]{"aid", "adi"};
        nikhil = new String[]{"haddr", "nikhil", "heddarrey", "haider", "hatter", "hagaider"};
        anish = new String[]{"anish", "jaenisch", "haenis", "hyenis", "anish", "jayeenisk", "hagaenis"};
        arnav = new String[]{"arnu", "isimyox", "isimo", "arnweesimo"};
        devansh = new String[]{"itsudu", "devansh", "dhoovansh", "doovonsh"};
        abhi = new String[]{"yaba", "abhi"};
        saketh = new String[]{"saketh", "sock", "sack", "sawk"};
        kavin = new String[]{"kavi"};
        if(contains(adi, s)){
            e.getMessage().addReaction(e.getGuild().getEmotesByName("aid", true).get(0)).queue();
        }
        if(contains(anish, s)){
            e.getMessage().addReaction(e.getGuild().getEmotesByName("jaenisch", true).get(0)).queue();
        }
        if(contains(arnav, s)){
            e.getMessage().addReaction(e.getGuild().getEmotesByName("isimyox", true).get(0)).queue();
        }
        if(contains(devansh, s)){
            e.getMessage().addReaction(e.getGuild().getEmotesByName("itsudu", true).get(0)).queue();
        }
        if(contains(abhi, s)){
            e.getMessage().addReaction(e.getGuild().getEmotesByName("yabashee", true).get(0)).queue();
        }
        if(contains(saketh, s)){
            e.getMessage().addReaction(e.getGuild().getEmotesByName("sock", true).get(0)).queue();
        }
        if(contains(kavin, s)){
            e.getMessage().addReaction(e.getGuild().getEmotesByName("kavita", true).get(0)).queue();
        }
        if(contains(nikhil, s)){
            e.getMessage().addReaction(e.getGuild().getEmotesByName("haddr", true).get(0)).queue();
        }


    }

    public boolean contains(String[] names, String str){
        for(String s: names){
            if(str.contains(s))
                return true;
        }
        return false;
    }
}
