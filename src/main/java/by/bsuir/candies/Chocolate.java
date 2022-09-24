package by.bsuir.candies;

import by.bsuir.enums.ChocoTypes;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Chocolate extends Candies{

    ChocoTypes chocoType;


    public Chocolate(String name, Long cost, Double weight, String type, ChocoTypes chocoType) {
        super(name, cost, weight, type);
        this.chocoType = chocoType;
    }

    @Override
    public String toString() {
        return super.toString()+"type of chocolate="+chocoType;
    }
}
