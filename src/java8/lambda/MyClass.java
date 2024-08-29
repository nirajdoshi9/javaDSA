package java8.lambda;

public class MyClass implements Runnable{

    @Override
    public void run() {
        for(int i = 1; i<11; i++)
            System.out.println("Hello "+ i);
    }
}
