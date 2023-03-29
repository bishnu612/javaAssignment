package AssignmentOne;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Long.sum;

public class Assignment3Array {


    public void assignment3() {
        Scanner sc = new Scanner(System.in);

        int i,n,large, small;
        int sum=0;
        int avg=0;
        int product=1;

        System.out.println("Enter the number of elements:") ;
        n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements") ;
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        large = a[0];
        for(i=1;i<n;i++)
        {
            if(large<a[i])
            {
                large = a[i];
            }
        }

        small =a[0];
        for (i=1;i<n;i++)
        {
            if (small>a[i])
            {
                small=a[i];
            }
        }

        System.out.println("Largest of "+n+" elements in an array = "+large);
        System.out.println("Smallest of "+n+" elements in an array = "+small);

       for ( int j = 0; j < n; j++)
        {
            sum += a[j];

        }
        System.out.println("Sum of array is :" + sum);


        for ( int j = 0; j < n; j++)
        {
            avg = sum/ a.length;

        }
        System.out.println("Avg of array is :" + avg);

        for ( int j = 0; j < n; j++)
        {
            product *= a[j];

        }

        System.out.println("Product of array is :" + product);

    }
}

