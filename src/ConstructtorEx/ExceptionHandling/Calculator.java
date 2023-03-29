package ConstructtorEx.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public void calculator(){
        Scanner scanner = new Scanner(System.in);

        //System.out.println("enter 1st no.: ");
        //int a= scanner.nextInt();

        //System.out.println("enter 2nd no.: ");
        //int b= scanner.nextInt();

        try {
            System.out.println("enter 1st no.: ");
            int a = scanner.nextInt();
            System.out.println("enter 2nd no.: ");
            int b= scanner.nextInt();
            System.out.println(" Division of two number  is :"+(a/b));
        }catch(InputMismatchException e2){
            System.out.println("String not acceptable");

        } catch(ArithmeticException e1){
            e1.getMessage();
            System.out.println("Can not divide by zero");
        }

    }
}

