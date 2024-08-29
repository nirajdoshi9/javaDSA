package java8.lambda;

public class Main {
    public static void main(String[] args) {
//        Employee se = new SoftwareEngineer();
//        System.out.println(se.sayHello());

//        Employee se = () -> "Software Engineer";
//        System.out.println(se.getName());
//
//        Employee e = () -> "Editor";
//        System.out.println(e.getName());

//        MyClass mc = new MyClass();
//        Thread thread = new Thread(mc);
//        thread.run();

         Runnable runnable = () ->{
             for(int i = 1; i<11; i++)
             System.out.println("Hello "+ i);
         };
        Thread thread1 = new Thread(runnable);
        thread1.run();
    }
}
