package org.example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 */

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()){
            int numerito = sc.nextInt();
            System.out.println(numerito+1);
        }
        else {
            System.out.println("ta mal escrito");
        }





    }
}
