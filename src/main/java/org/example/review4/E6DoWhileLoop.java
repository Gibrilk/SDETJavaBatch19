package org.example.review4;

import java.util.Scanner;

public class E6DoWhileLoop {

    public static void main(String[] args) {

        Scanner Scanner=new Scanner(System.in);
        int number= 0;
        do{
            System.out.println("Please Enter the number");
            number=Scanner.nextInt();
        }
        while(number<10);
    }
}
