package Interface;

public class Tata implements Car,Bus {


    @Override
    public void speed() {

        System.out.println("Speed of car is : 80km/hr");
    }

    @Override
    public void milage() {

        System.out.println("20");

    }

    @Override
    public void model() {
        System.out.println("HONDA");
    }
}
