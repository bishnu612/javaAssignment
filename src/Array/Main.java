package Array;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args){
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);


        System.out.println(cars.get(0));

        Collections.sort(cars);
        System.out.println("After Asc sorting" +cars);

        Collections.sort(cars,Collections.reverseOrder());
        System.out.println("After desc sorting"+cars);


        cars.set(0, "Opel");
        System.out.println(cars);

        System.out.println(cars.get(0));

        cars.remove(0);
        System.out.println(cars);
        System.out.println(cars.get(0));

        cars.size();
        System.out.println("The size of the array is "+cars.size());

        Collections.sort(cars);
        System.out.println(cars);


        cars.clear();
        System.out.println(cars);




    }
}
