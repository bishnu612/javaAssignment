import java.util.Scanner;

public class Calculation {
    //void sum (int a, int b){

    public void Calculation(){

        Scanner scanner = new Scanner(System.in);

    System.out.println("enter 1st no.: ");
    int a= scanner.nextInt();

    System.out.println("enter 2nd no.: ");
    int b= scanner.nextInt();

        System.out.println("The sum of two number is " +(a+b));
    }

    //void sum (double a, double b){
        //System.out.println("The sum of two number is " +(a+b));
    //}



    public static void main(String[] args) {
        Calculation obj = new Calculation();
       obj.Calculation();
    }
}