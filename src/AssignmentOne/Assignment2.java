package AssignmentOne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment2 {

    public void assignment2() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the First Integer:");
            int a = scanner.nextInt();
            System.out.println("Enter the Second Integer");
            int b = scanner.nextInt();

            if (a > b) {
                System.out.println("The Larger among the two number is :" + a);
            }
            if (b > a) {
                System.out.println("The Larger among the two number is :" + b);
            }

            if (a == b) {
                System.out.println(" Both the entered integer are equal");
            }
        }catch(InputMismatchException e){
            System.out.println("Enter the integer");
        }
    }
}