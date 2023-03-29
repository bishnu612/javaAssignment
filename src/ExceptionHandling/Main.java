package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int i=sc.nextInt();
        try {
            if (i == 10) {
                throw new InputTenException();
            }
            System.out.println("Result is: " + 150 / i);

        }catch(InputMismatchException ex2){
            ex2.getMessage();
            //System.out.println("You have inputted String.");
        }
        catch(InputTenException ex1){
            ex1.getMessage();
            //System.out.println("please do not input 10.");
        }
        catch(Exception ex){
            System.out.println("other error!");
        }
    }
}
