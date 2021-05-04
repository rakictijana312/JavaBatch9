package class25.overriding;

public class Khadija extends KFather{

    public Khadija(String name){

        super(name);
    }

    @Override
    void eat() {
        super.eat();//parebnt method will exicute + one extra line of code
        System.out.println(name+" likes beans as well");
    }

    @Override
    void sleep() {//you can overide and provide differen implementation zato sto ne koristimo SUPER
        System.out.println(name+" likes to sleep 12 hours");
    }
}
