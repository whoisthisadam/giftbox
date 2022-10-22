package by.bsuir.candies;


import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Candies {

    String name;

    Long cost;

    Double weight;

    String type;


    @Override
    public String toString() {
        return "\nCandies{" +
                "name=" + name +"\n"+
                "cost=" + cost +"\n"+
                "weight=" + weight +"\n"+
                "type=" + type +"\n"+
                '}';
    }
}
