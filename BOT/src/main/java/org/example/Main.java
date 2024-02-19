package org.example;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.generics.TelegramBot;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       var api = new TelegramBotsApi(DefaultBotSession.class);
       api.registerBot(new MyBot());
        }
        }
 //t.me/mysuperbot30_bot.
//6479637903:AAFJdXPCZZ6RBXFK_UmvZ9I8BcqkbDqWvsM