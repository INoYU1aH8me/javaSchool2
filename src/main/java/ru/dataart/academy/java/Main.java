package ru.dataart.academy.java;

import ru.dataart.academy.java.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.print("how many figures?");
        Calculator calculator=new Calculator();
        int n=0;
        Scanner in = new Scanner(System.in);
        n= in.nextInt();
        Figure[] figures= new Figure[n];
        for(int i=0; i<n; i++) {
            if (i % 2 == 0) {
                figures[i] = new Circle(i + 1);
                System.out.println("made circle with radius " + (i + 1));
            } else {
                figures[i] = new Rectangle(i + 2, i + 1);
                System.out.println("made rectangle with sides: " + (i+2) + ", "+ (i+1));
            }
        }
        System.out.printf("sum of squares= %.2f",calculator.CalculateSquaresSum(figures));

        in.close();


    }
}