package Encapsulation;

public class OutputDog {

    public static void main(String[] args) {
        Dog zz = new Dog();

        zz.setColor("RED");
        System.out.println("The color of Dog is " +zz.getColor());
        zz.setName("Tommy");
        System.out.println("The name of the Dog is " +zz.getName());
        zz.setBreed("African");
        System.out.println("The breed of the dog is " +zz.getBreed());
        zz.setAge(20);
        System.out.println("The age of the dog is " +zz.getAge());
    }
}
