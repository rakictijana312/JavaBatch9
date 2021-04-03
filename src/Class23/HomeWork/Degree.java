package Class23.HomeWork;

//Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
//Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters'. In Masters class override method 'getPrerequisite'.
//Call the method by creating an object of each of the three classes.


public class Degree {

    void getPrerequisite() {
        System.out.println("To get degree you new high school diploma");
    }
}
    class Bachelors extends Degree{

    }
    class Masters extends Degree{
    @Override
        void getPrerequisite() {
            System.out.println("To get Masters degree you need batchler degree");

    }}

class Tester{
    public static void main(String[] args) {
        Degree d= new Degree();
        d.getPrerequisite();

        Bachelors b= new Bachelors();
        b.getPrerequisite();

        Masters m= new Masters() ;
        m.getPrerequisite();
    }

    }










