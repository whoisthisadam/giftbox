package by.bsuir.gift;

import by.bsuir.candies.Candies;

import java.util.List;

public interface GiftBoxOptions {

    Double calculateWeight(List<Candies>list);

    Double calculateAvgWeight(List<Candies> list);

}
