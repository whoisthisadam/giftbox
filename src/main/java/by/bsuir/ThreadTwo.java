package by.bsuir;

import java.util.ArrayList;
import java.util.List;

public class ThreadTwo extends Thread{

    public void run(){
        List<Integer>list=new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(list);
    }
}
