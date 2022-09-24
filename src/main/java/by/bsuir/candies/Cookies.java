package by.bsuir.candies;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Cookies extends Candies{

    Long count;

    public Cookies(String name, Long cost, Double weight, String type, Long count) {
        super(name, cost, weight, type);
        this.count = count;
    }

    @Override
    public String toString() {
        return super.toString()+"count="+count;
    }
}
