package Array;

import java.util.HashMap;

public class OutputHashListEx {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(1,"java");
        hashMap.put(2,"C++");
        hashMap.put(3,"C#");
        hashMap.put(4,"C--");


        for (String i : hashMap.values()) {
            System.out.println(i);
        }

        //hashMap.remove("java");

        for (String i : hashMap.values()) {
            System.out.println(i);
        }
    }
}
