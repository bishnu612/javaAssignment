package Inheritance.SingleInheritance;

public class OutputInherit {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Lion lion = new Lion();

       // System.out.println(cat.child);
        //System.out.println(cat.name);
        //cat.animalColor();
        cat.display();
        lion.display1();
        System.out.println(cat.name);
        cat.animalColor();


    }
}
