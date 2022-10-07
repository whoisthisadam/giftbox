package by.bsuir.gift;

import by.bsuir.candies.Candies;

import java.util.List;

public interface GiftBoxOptions {

    Double calculateWeight(List<Candies>list);

    List<Candies>filterMoreThanAvgWeight(List<Candies> list);

    Double calculateAverageWeight(List<Candies>list);

}
