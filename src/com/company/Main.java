package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int count=1;

        Scanner scannerInt = new Scanner(System.in);
        boolean isNumber;
        int sum=0;

        while (count<=10) {

            System.out.println("Enter number #" + count + ":");
            isNumber = scannerInt.hasNextInt();

            if(isNumber) {

                sum += scannerInt.nextInt();
                count++;
            } else {
                System.out.println("Invalid number!");
            }
            scannerInt.nextLine();


        }
        System.out.println("The sum of the numbers entered is: " + sum);

        scannerInt.close();
    }
}
