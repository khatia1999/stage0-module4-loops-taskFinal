package school.mjc.stage0.loops.finalTask;

import java.util.Scanner;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();


        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", numberTableToPrint, i, numberTableToPrint * i);
        }
        
    }


    }

