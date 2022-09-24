package by.bsuir.gift;


import by.bsuir.candies.Candies;
import by.bsuir.candies.Chocolate;
import by.bsuir.candies.Cookies;
import by.bsuir.candies.Marshmallow;
import by.bsuir.enums.ChocoTypes;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
public class GiftBox implements GiftBoxOptions{





    public static List<Candies> createBox(){
        GiftBox giftBox = new GiftBox();
        ArrayList<Candies>list=giftBox.firstCollection();
        System.out.println("Here is your list:");
        System.out.println(list);
        System.out.println("Sum of weight:"+giftBox.calculateWeight(list));
        return list;
    }





    @Override
    public Double calculateWeight(List<Candies> list) {
        return list.stream().map(Candies::getWeight).reduce(0.0, Double::sum);
    }


    public ArrayList<Candies> firstCollection(){
        ArrayList<Candies>list=new ArrayList<>();
        list.add(new Cookies("Oreo", RandomUtils.nextLong(1L,3000L), 12.32, "Cookies", RandomUtils.nextLong(1L,100L)));
        list.add(new Chocolate("Alpen Gold", RandomUtils.nextLong(), RandomUtils.nextDouble(1.0,100.0), "Chocolate", ChocoTypes.MILK));
        list.add(new Marshmallow("BonPari",RandomUtils.nextLong(1L,1000L),RandomUtils.nextDouble(1.0,100.0),"Marshmallow", "Strawberry"));
        list.add(new Cookies("ChocoPie",RandomUtils.nextLong(1L,1000L),RandomUtils.nextDouble(1.0,100.0),"Cookies",RandomUtils.nextLong(1L,50L)));
        list.add(new Chocolate("Milka", RandomUtils.nextLong(1L, 1000L),RandomUtils.nextDouble(1.0,300.0),"Chocolate", ChocoTypes.DARK));
        return list;
    }
}
