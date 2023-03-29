package AssignmentOne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment3 {

    public void assignment3() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the First Integer:");
            int a = scanner.nextInt();
            System.out.println("Enter the Second Integer");
            int b = scanner.nextInt();
            System.out.println("Enter the Third Integer");
            int c = scanner.nextInt();

            System.out.println("The Sum of 3 integer:"+(a+b+c));
            System.out.println("The Average of 3 integer:"+(a+b+c)/3);
            System.out.println("The Product of 3 integer:"+(a*b*c));

            if (a>b && b>c) {
                System.out.println("The Largest among the number is :" + a);
                System.out.println("The Smallest among the number is :" + c);
            }
            if (b>a && a>c) {
                System.out.println("The Largest among the number is :" + b);
                System.out.println("The Smallest among the number is :" + c);
            }

            if (c>b && b>a) {
                System.out.println("The Largest among the number is :" + c);
                System.out.println("The Smallest among the number is :" + a);
            }

            if (c>a && a>b) {
                System.out.println("The Largest among the number is :" + c);
                System.out.println("The Smallest among the number is :" + b);
            }


        }catch(InputMismatchException e){
            System.out.println("Input the Integer");
        }

    }
}