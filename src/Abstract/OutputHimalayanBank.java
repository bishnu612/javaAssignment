package Abstract;

public class OutputHimalayanBank {

    public static void main(String[] args) {
        HimalayanBank himalayanbank = new HimalayanBank();
        //abstract method
         himalayanbank.getRateOfInterest();
        System.out.println(himalayanbank.getRateOfInterest());

        //non abstract
        himalayanbank.display();

        //static
        HimalayanBank.displayBankName();
    }
}
