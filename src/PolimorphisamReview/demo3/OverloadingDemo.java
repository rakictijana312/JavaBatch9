package PolimorphisamReview.demo3;

public class OverloadingDemo {
    public static void main(String[] args) {
        String name="yulia os a good student yulia does her homework on time";
        System.out.println(name.indexOf("yulia"));//0
        System.out.println(name.indexOf("yulia",10));//output 24/

        add(10,10,10.0);
    }

    static void add(int a,int b){

        System.out.println(a+b);
    }
    static void add(int a,int b,double c){
        System.out.println(a+b+c);
    }
}
