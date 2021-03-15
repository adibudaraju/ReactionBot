package com.adibuda.bot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main{
    public static void main(String[] args) throws LoginException {
        JDA jda = JDABuilder.createDefault("ODIxMTA1NDAwMTg2MjczODE0.YE-3_g.fkTXnWthnFuaAbnnmhMMDpoI4W0").build();
        jda.addEventListener(new BozoEvent());
    }
}
