package class22.HomeWork1;

public class Programing {

    //Create a class named 'Programming'. While creating an object of the class,
    // if nothing is passed to it, then the message "I love programming languages" should be printed.
    // If some String is passed to it, then in place of "programming languages" the value variable should be printed.
    // Example, if we pass "Java", then "I love Java" should be printed.

    Programing(){
        System.out.println("I love programing");

    }
    Programing(String value) {
        System.out.println("I love " + value);

    }

    public static void main(String[] args) {
        new Programing();
        new Programing("C++");


    }




}
