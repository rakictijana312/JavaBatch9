package PolimorphisamReview.demo;

//OVO JE JEDINI PRIMER KORISCENJA SUPER IN INDUSTRI BY USING CONSTRUCTORS
//WE DO NOT NEED TO WRITE SUPER IF WE DONT WANT BEACUSE BY IHERITANCE WILL BE
//SET UP BY DIFAULT.
public class Parent {
    String name;
    String address;


    public Parent(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void  printInfo(){
        System.out.println("Name "+name+" address "+address);
    }
}
   class Child extends Parent{

       public Child(String name, String address) {
           super(name, address);
       }
   }

   class Main {
       public static void main(String[] args) {
           Child child=new Child("tijana", "mihailo");
           child.printInfo();// ALWAYS WILL EXICUTE CHILD CLASS

       }
   }
