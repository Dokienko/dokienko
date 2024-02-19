package org.example;
import net.thauvin.erik.crypto.CryptoPrice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws  Exception{
        var scanner = new Scanner(System.in);

        //System.out.println("What is BTC price today?");
         //var rate = scanner.nextDouble();

       var rate = CryptoPrice.spotPrice("BTC");
        System.out.println("BTC price is " + rate.getAmount());

         while (true) {
             System.out.println("How mach $ do you have?");
             var dollars = scanner.nextDouble();

             if (dollars == 0)
                 break;

             var result = dollars / rate.getAmount().doubleValue();
             System.out.println("Result = " + result);
         }
        }
    }
