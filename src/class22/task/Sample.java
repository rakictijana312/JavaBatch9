package class22.task;

//Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
// Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
// Print users name, mobile number and address in userDetails method. Test your code.

public class Sample {
    static void printInfo(String name){

        System.out.println(name);
    }
    static void printInfo(String name,String address){
        System.out.println(name+address);
    }

    static void printInfo(String name,String address,String phoneNumber){
        System.out.println(name+phoneNumber+address);
    }

    public static void main(String[] args) {
        printInfo("MJ");
        printInfo("MJ","address 123");
        printInfo("MJ","address 123","1234566");
    }
}
