package NonAccessModifier;

import java.util.Scanner;

public class OutputStaticEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the Number:");
        int a = scanner.nextInt();
        System.out.println(StaticEx.cube(a));
        System.out.println(" Enter the length for perimeter:");
        float b = scanner.nextFloat();
        System.out.println(" Enter the breadth for perimeter:");
        float c = scanner.nextFloat();
        System.out.println(StaticEx.perimeter(b,c));

    }
}
