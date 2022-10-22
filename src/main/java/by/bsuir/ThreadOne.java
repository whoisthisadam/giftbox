package by.bsuir;

public class ThreadOne implements Runnable{

    @Override
    public void run() {
        int b=4,a=10;
        int result=a+b;
        System.out.println(result);
    }
}
