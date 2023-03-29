package ControlStatements.DecisionMaking;

import java.util.Scanner;

public class College {

    public void displayId(){
       int a = 548;

       if (a==548) {
           System.out.println("ID is : 548:");
       } else {
           System.out.println("ID Incorrect:");
       }
    }

    public void displayIdd() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Science Marks:");
        int scienceMarks = scanner.nextInt();

        System.out.println("Enter the Math Marks");
        int mathMarks = scanner.nextInt();

        int pcnt = (mathMarks + scienceMarks) / 2;

        if ((mathMarks > 100) || (scienceMarks > 100) || (mathMarks < 0) || (scienceMarks) < 0) {
            System.out.println("Incorrect Data");
        } else {
            if (mathMarks >= 50 && scienceMarks >= 50) {
                System.out.println("You are Pass");

                if (pcnt < 60) {
                    System.out.println("Second Division");
                } else if (pcnt >= 60 && pcnt < 80) {
                    System.out.println("First Division");
                } else if (pcnt >= 80) {
                    System.out.println("Distinction");
                }
            } else {
                System.out.println("Failed");
            }


        }
    }
    }
