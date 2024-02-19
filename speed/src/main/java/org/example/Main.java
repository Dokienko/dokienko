package org.example;

import javax.xml.transform.Result;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("What is the speed of the car in kilometers per hour?");
        var rate = scanner.nextDouble();
        while (true) {

        System.out.println("what is the travel time in hours?");
        var time = scanner.nextDouble();

        if (time == 0)
            break;

        var result = time * rate;
        System.out.println("Result = " + result);

    }
        }
    }
