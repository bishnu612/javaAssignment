package Abstract;

public abstract class Bank {

    public abstract int getRateOfInterest();

    public void display(){
        System.out.println("This is bank");
    }

    public static void displayBankName(){

        System.out.println("This is Head Bank");
    }
}
