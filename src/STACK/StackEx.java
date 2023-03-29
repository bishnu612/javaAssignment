package STACK;

import java.util.Scanner;
import java.util.Stack;

public class StackEx {

    public void displayStack(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the String");
        String b = scanner.nextLine();

        Stack stack = new Stack();

        for( int i=0;i<b.length();i++) {
            stack.push(b.charAt(i));
        }

        String reverseString="";
        while (!stack.isEmpty()){
            reverseString +=stack.pop();
        }

        if (b.equals(reverseString)){
            System.out.println("Palindrome:");
        }else{
            System.out.println("Not Palindrome");
        }
        System.out.println("The input string entry is " +b);
        System.out.println("The reverse entry is " +reverseString);
    }
}
