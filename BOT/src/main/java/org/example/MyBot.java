package org.example;

import net.thauvin.erik.crypto.CryptoPrice;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {
    public MyBot(){
        super("6479637903:AAFJdXPCZZ6RBXFK_UmvZ9I8BcqkbDqWvsM");
    }

    @Override
    public void onUpdateReceived(Update update) {
        var chatId = update.getMessage().getChatId();
        var text = update.getMessage().getText();

        try {
        var message = new SendMessage();
        message.setChatId(chatId);

        if (text.equals("/start")) {
            message.setText("Hello!");
        } else if (text.equals("btc")) {
            var price = CryptoPrice.spotPrice("BTC");
            message.setText("BTC price: " + price.getAmount().doubleValue());
        } else if (text.equals("eth")) {
            var price = CryptoPrice.spotPrice("ETH");
            message.setText("ETH price: " + price.getAmount().doubleValue());
        } else if (text.equals("bnb")) {
            var price = CryptoPrice.spotPrice("BNB");
            message.setText("BNB price: " + price.getAmount().doubleValue());
        }   else {
            message.setText("Unknown command!");
        }

            execute(message);
        } catch (Exception e) {
            System.out.println("Error!");
        }

    }

    @Override
    public String getBotUsername() {
        return "mysuperbot30_bot";
    }
}
