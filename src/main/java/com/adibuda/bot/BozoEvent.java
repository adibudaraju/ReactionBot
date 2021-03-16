package com.adibuda.bot;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.List;

public class BozoEvent extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent e){
        Message msg = e.getMessage();
        String s = msg.getContentStripped().toLowerCase();
        String[] adi, nikhil, anish, arnav, devansh, abhi, saketh, kavin;
        long adiid, nikhilid, anishid, arnavid, devanshid, abhiid, sakethid, kavinid;
        adiid = 621521274203799568L;
        nikhilid = 688576713197617223L;
        anishid = 704138527977373756L;
        sakethid = 470066750252122113L;
        abhiid = 621562283377819648L;
        arnavid = 540359123850625025L;
        devanshid = 501407680334659586L;
        kavinid = 717205789621616711L;
        adi = new String[]{"aid", "adi"};
        nikhil = new String[]{"haddr", "nikhil", "heddarrey", "haider", "hatter", "hagaider"};
        anish = new String[]{"anish", "jaenisch", "haenis", "hyenis", "anish", "jayeenisk", "hagaenis"};
        arnav = new String[]{"arnu", "isimyox", "isimo", "arnweesimo"};
        devansh = new String[]{"itsudu", "devansh", "dhoovansh", "doovonsh"};
        abhi = new String[]{"yaba", "abhi"};
        saketh = new String[]{"saketh", "sock", "sack", "sawk"};
        kavin = new String[]{"kavi"};
        if(contains(adi, s) || contains(msg, adiid)){
            e.getMessage().addReaction(e.getGuild().getEmotesByName("aid", true).get(0)).queue();
        }
        if(contains(anish, s) || contains(msg, anishid)){
            e.getMessage().addReaction(e.getGuild().getEmotesByName("jaenisch", true).get(0)).queue();
        }
        if(contains(arnav, s) || contains(msg, arnavid)){
            e.getMessage().addReaction(e.getGuild().getEmotesByName("isimyox", true).get(0)).queue();
        }
        if(contains(devansh, s) || contains(msg, devanshid)){
            e.getMessage().addReaction(e.getGuild().getEmotesByName("itsudu", true).get(0)).queue();
        }
        if(contains(abhi, s) || contains(msg, abhiid)){
            e.getMessage().addReaction(e.getGuild().getEmotesByName("yabashee", true).get(0)).queue();
        }
        if(contains(saketh, s) || contains(msg, sakethid)){
            e.getMessage().addReaction(e.getGuild().getEmotesByName("sock", true).get(0)).queue();
        }
        if(contains(kavin, s) || contains(msg, kavinid)){
            e.getMessage().addReaction(e.getGuild().getEmotesByName("kavita", true).get(0)).queue();
        }
        if(contains(nikhil, s) || contains(msg, nikhilid)){
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

    public boolean contains(Message msg, long id){
        Guild g = msg.getGuild();
        Member m = g.retrieveMemberById(id).complete();
        List<Role> roles = msg.getMentionedRoles();
        if (!roles.isEmpty() && m.getRoles().contains(roles.get(0)))
            return true;
        String content = msg.getContentStripped();
        String[] words = content.split(" ");

        for(String word: words){
            if(word!=null&&word.length()>0) {
                roles = g.getRolesByName(word, true);
                if (!roles.isEmpty() && m.getRoles().contains(roles.get(0)))
                    return true;
            }
        }
        roles = m.getRoles();
        for(Role role: roles){
            if(content.contains(role.getName().toLowerCase())) return true;
        }
        return false;
    }
}
