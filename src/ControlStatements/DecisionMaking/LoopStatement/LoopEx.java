package ControlStatements.DecisionMaking.LoopStatement;

import java.util.Scanner;

public class LoopEx {


    public void displayloop(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Your Name");
        String a = scanner.nextLine();
        for (int i=0; i<5;i++){
            System.out.println(":"+a);
        }
    }

    public void displayWhileLoop(){

        int number = 5;
        int i =1;
        while(i<=10){
            System.out.println( number +"*"+ i + "=" + number*i);
            i++;
        }
    }

    public void displayDowhileLoop(){

            Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number whose multiplication table you want");
        int a = scanner.nextInt();
       // int number = 5;
        int i =1;
        do{
            System.out.println( a +"*"+ i + "=" + a*i);
            i++;
        }
        while(i<=10);

         }

}
