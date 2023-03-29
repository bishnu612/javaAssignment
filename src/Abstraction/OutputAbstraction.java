package Abstraction;

public class OutputAbstraction {
    public static void main(String[] args) {
        Bike obj = new Honda4();
        obj.run();
        obj.display();
        obj.getRateOfInterest();

    }
}


//In this example, Bike is an abstract class that contains only one abstract method run.
// Its implementation is provided by the Honda class