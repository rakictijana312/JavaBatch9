package Class23.overriding;

public class Bank {

    void chargeTransferFee(double amount){
        System.out.println("Your Fee CT is "+amount*0.02);
    }
}
class BankOfAmerica extends Bank{
    void chargeTransferFee(double amount){
        System.out.println("Your fee B is "+amount*0.05);
    }
}

class Chase extends Bank{
    void chargeTransferFee(double amount){
        System.out.println("Your fee C is "+amount*0.03);
    }
}
class Citizen extends Bank{

}
