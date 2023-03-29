package AssignmentOne.Inheritance;

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(500, 500, "red", 30);
        Ford fordOne = new Ford(300, 300, "black", 2021, 35);
        Ford fordTwo = new Ford(250, 250, "yellow", 2020, 40);
        Car car = new Car(100, 100, "white");
        System.out.println("sedan " + sedan.getSalePrice());
        System.out.println("fordOne " + fordOne.getSalePrice());
        System.out.println("fordTwo " + fordTwo.getSalePrice());
        System.out.println("car  " + car.getSalePrice());
    }
}
