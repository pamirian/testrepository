package com.company;

import java.util.Scanner;

public class Main {

// Task1. Implement the method that takes three numbers and returns minimum of they. Example: getMinimum(5,6,1) ->1

    /*
     System.out.println(min3(10,20,30)); // 10
        System.out.println(min3(10,-20,30)); // -20
        System.out.println(min3(10,-20,-40)); // -40
        System.out.println(min3(10,0,0)); // 0
        System.out.println(min3(1,10,10)); // 1
    }

    public static int min3(int num1,int num2, int num3){
        return min2(min2(num1,num2),num3);
    }

    public  static int min2(int num1,int num2){
        if (num1<num2){
            return num1;
        } else {
            return num2;
        }
     */


    public static void main(String[] args) {
        String equal = "not detected. Numbers are equal";
        System.out.println("Enter numbers: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println("Min is: "+minOfNumbers(number1, number2, number3, equal));
    }
    public static int minOfNumbers(int number1, int number2, int number3, String equal){

        if ((number1<number2)&&(number1<number3)) {return number1;}
        else if ((number2<number1)&&(number2<number3)) {return number2;}
        else if ((number3<number1)&&(number3<number1)) {return number3;}
        return 0;
    }
}