// Работа со Временем

package com.company;

import java.time.LocalTime;

public class Main {

    public static void main(String args[]) {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.toString());
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.MIDNIGHT);
        System.out.println(localTime.NOON);

    }
}
