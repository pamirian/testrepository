package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter numbers: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("It is "+dayOfWeek(number));
    }
    public static String dayOfWeek(int number){
        String day;
        if (number == 1){
            day = "Monday";
        } else
        if (number == 2){
            day = "Tuesday";
        } else
        if (number == 3){
            day = "Wednesday";
        } else
        if (number == 4){
            day = "Thursday";
        } else
        if (number == 5){
            day = "Friday";
        } else
        if (number == 6){
            day = "Saturday";
        } else
        if (number == 7){
            day = "Sunday";
        } else {
            day = "not correct";
        }
        return day;
    }
}


