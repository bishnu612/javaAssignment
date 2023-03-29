package Operators;

import java.util.Scanner;

public class OperatorsEx {

    public void arithmeticOperators() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number");
        int a = scanner.nextInt();
        System.out.println("Enter Second Number");
        int b = scanner.nextInt();


        int c = a + b;
        int d = a * b;
        System.out.println("The sum of two number is " + c);
        System.out.println("The multiplication of two number is " + d);


    }

    public void displayName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Name");

        String a = scanner.nextLine();

        if ( a.equals("JAVA")) {
            System.out.println("Your Name is " + a);
        } else {
            System.out.println("Can not find name " + a);
        }
           }

           public void displayId() {
        int mathMarks = 50;
        int scienceMarks= 40;

        if (mathMarks>50 && scienceMarks>50) {
            System.out.println("A");
        } else if (mathMarks>30 && scienceMarks>30) {
            System.out.println("Excellent");
        } else {
            System.out.println("Failed");
        }

    }

    public void switchMarks(){
        int marks = 990;
        switch (marks){
            case 20:
                System.out.println("D");
                break;
            case 10:
                System.out.println("F");
                break;
            case 40:
                System.out.println("A");
                break;
            default:
                System.out.println("can not find marks");
        }

    }

    //main method:
    public static void main(String[] args) {
        OperatorsEx zz = new OperatorsEx();
        //zz.displayName();
        //zz.displayId();
        zz.switchMarks();

       // zz.arithmeticOperators();



    }
}
