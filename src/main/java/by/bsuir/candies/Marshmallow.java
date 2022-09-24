package by.bsuir.candies;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Marshmallow extends Candies{

    String flavour;

    public Marshmallow(String name, Long cost, Double weight, String type, String flavour) {
        super(name, cost, weight, type);
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return super.toString()+"flavour="+flavour;
    }
}
