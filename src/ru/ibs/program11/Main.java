package ru.ibs.program11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String number1 = input.next();
        int number2 = input.nextInt();

        if (Integer.parseInt(number1) > number2){
            System.out.println("Число "+number1+" больше");
            System.out.println("Число "+ (double) number2 +" меньше");
        }
        else if (number2 > Integer.parseInt(number1)) {
            System.out.println("Число "+number2+" больше");
            double number3 = Double.parseDouble(number1);
            System.out.println("Число "+number3+" меньше");
        }
    }
}
