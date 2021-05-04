

//REVIEW GOOGLE DRIVE
         package PolimorphisamReview.demo5;

public class Exam {
//CLASS
    public static void main(String[] args) {
        Employee var1=new Secretary();
        LegalSecratary var2= new LegalSecratary();
        Employee var3=new Lawyer();
        Employee var4 =new LegalSecratary();
        Employee var5= new Employee();
        Object var6=new Secretary();

       //var1.method1();
       //var2.method2();
       //var3.method1();
        //var4.method1();
       // var5.method1();
       // var6.method1(); think twice {output)we will get ERROR
        //var3.method2();think twice {output)we will get ERROR
       // var1.method3();
     //  var3.method3();
      //((LegalSecratary)var6).method1();CE
      //  ((Secretary)var3).method2();CE
      // ((LegalSecratary)var4).method2();
       //((Employee)var6).method3();
        //((Secretary)var4).method3();

       // ((Lawyer)var3).method2();

    }
}

