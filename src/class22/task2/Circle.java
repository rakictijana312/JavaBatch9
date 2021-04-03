package class22.task2;

public class Circle extends Shape{


    //Write program: Shape class has a constructor that takes the radius and has
    // a subclass as  circle class. In circle class create a method to calculate the area of circle. Test your code

    Circle(double radius) {

        super(radius);
    }

    void calculateArea(){
        System.out.println(Math.pow(radius,2)*Math.PI);
        System.out.println(radius*radius*3.14);
    }

    public static void main(String[] args) {
        Circle circle=new Circle(2);
        circle.calculateArea();
    }
}
