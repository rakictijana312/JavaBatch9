package class25.overriding;

public class KhadijaTester {
    public static void main(String[] args) {
       Object [] arr={new String("Test"),new Khadija("ksdk")};// Parent class of all the classes that can exist in java
        /*KFather obj1=new Ozoda("Ozoda");
        obj1.eat();
        obj1.sleep();*/

        // String as=new Khadija("name"); CE because no inheritance relationship
      // executeAllMethods(new KFather("Mirza"),new Ozoda("Ozoda"),new Khadija("Khadija"));

     //we can exicute na dva nacina all methods using arr or new method,//
        //lakse je sa array kao sto je prikazano u zaddnjem primeru
        // (KFather kFather:kFatherArr
        //           ) {
        //            kFather.sleep();
        //            kFather.eat();

       KFather[] kFatherArr={new KFather("Mirza"),new Ozoda("Ozoda"),new Khadija("Khadija")};
       executeAllMethods(kFatherArr);


        KFather obj1=new Ozoda("Ozoda");
        obj1.sleep();
        KFather obj2=new Khadija("Khadija");
        obj2.sleep();
    }

    static void  executeAllMethods(KFather kFather,Ozoda ozoda,Khadija khadija) {
        //uvek static them Void to exicute all methods
        kFather.eat();
        kFather.sleep();
        ozoda.eat();
        ozoda.sleep();
        khadija.eat();
        khadija.sleep();
    }
//    }
//
   static  void executeAllMethods(KFather [] kFatherArr){

 for (KFather kFather:kFatherArr
           ) {
            kFather.sleep();
            kFather.eat();
        }
    }
}
