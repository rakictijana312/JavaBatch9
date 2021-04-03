package class24.demo;

import java.lang.reflect.Constructor;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.salary=100000;
        e.getPaid();

      Contractor constructor =new Contractor();
        constructor.salary=50;
        constructor.getPaid();

        //widening
        double var1=10;
        System.out.println(var1);//10

        int var2=(int)10.0;
        System.out.println(var2);

        //wideing upcasting
        Employee contractor2 = new Contractor();

        //narrowing downcasting
        Contractor contractor3= (Contractor) new Employee();





    }


}
