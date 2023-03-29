package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ArrayListEx {

    public void displayCourse() {
        ArrayList <String> arrayList = new ArrayList<String>();
        //HashMap<Integer,String> hashList = new HashMap<Integer,String>();
        arrayList.add("JAVA");
        arrayList.add("C++");
        arrayList.add("C#");
       // arrayList.add(1);
        //arrayList.add(3.5);
        //arrayList.add(true);
        System.out.println("Aftrer adding:" + arrayList);

        for (String course: arrayList){
            System.out.println("After iterating through look:"+ course);
        }
        //*System.out.println(arrayList.get(1));
        //System.out.println(arrayList.get(0));
         //System.out.println(arrayList.get(2));

        System.out.println(arrayList.contains("JAVA"));///true false
        arrayList.remove("JAVA");///remove
        System.out.println(" After removing from array list:"+arrayList);
       // System.out.println(arrayList);

        arrayList.set(0,"Spring");
        System.out.println(" After updating from array list:"+arrayList);
       // System.out.println(arrayList);

        Collections.sort(arrayList);////ascending
        System.out.println("After sorting"+arrayList);

        Collections.sort(arrayList,Collections.reverseOrder());
        System.out.println("After desc sorting"+arrayList);

        System.out.println("Size of the list is :"+arrayList.size());

    }

    public void students(){
        ArrayList<Student> students = new ArrayList<>();
        Student student= new Student();
        student.setId(12);
        student.setName("java");

        Student student1= new Student();
        student1.setId(21);
        student1.setName("AVAJ");

        students.add(student);
        System.out.println(students);


        students.add(student1);
        System.out.println(student1);
    }




}