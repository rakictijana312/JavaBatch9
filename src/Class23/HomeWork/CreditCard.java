package Class23.HomeWork;

//Create a class CreditCard and define variable balance and interest.
// Create an instance method that will calculate interest based on the given balance.
//Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
//Call the method by creating an object of each of the three classes

public class CreditCard {
    double balance;
    double interest;
    void checkInterest(double balance){
        interest=balance*0.24;
        System.out.println(interest);
    }
}
class Visa extends CreditCard{
}

class AX extends CreditCard{
    void checkInterest(double balance){
        interest=balance*0.23;
        System.out.println(interest);
    }


    public static void main(String[] args) {
        AX ax=new AX();
        ax.checkInterest(1000);
        Visa visa=new Visa();
        visa.checkInterest(1000);
        CreditCard creditCard=new CreditCard();
        creditCard.checkInterest(1000);
    }}