package class22.HomeWork1;

public class Sample {
    static void printInfo(String name){
        System.out.println(name);

    }
    static void printInfo(String name, String address){
        System.out.println(name+address);
}
    static void printInfo(String name, String address, String phone){
        System.out.println(name+address+phone);
    }

    public static void main(String[] args) {
        printInfo("MJ");
        printInfo("MJ", "123");
        printInfo("MJ", "123", "55");
    }   }
