package class22.superKeywordDemo2;

public class Animal {
    String name;
    int age;
    String color;

    public Animal(String name, int age, String color
                 ) {
        this.name = name;
        this.age = age;
        this.color = color;
        System.out.println("parametrized Parent");

    }
    public Animal(){
        System.out.println("Parent");
    }
}
