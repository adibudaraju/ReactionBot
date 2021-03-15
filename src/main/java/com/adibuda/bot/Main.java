package com.adibuda.bot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws LoginException, FileNotFoundException {
        String token = new Scanner(new File( "src/main/java/com/adibuda/bot/token.txt")).nextLine();
        JDA jda = JDABuilder.createDefault(token).build();
        jda.addEventListener(new BozoEvent());
    }
}
