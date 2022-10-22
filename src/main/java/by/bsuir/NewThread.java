package by.bsuir;

import by.bsuir.candies.Candies;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Comparator;
import java.util.List;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NewThread extends Thread{

    List<Candies>list;


    public void run(){

        list=list.stream().sorted(Comparator.comparing(Candies::getWeight).reversed()).toList();
        System.out.println(list);

    }
}
