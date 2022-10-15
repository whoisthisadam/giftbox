package by.bsuir.gift;

import by.bsuir.candies.Candies;

import java.util.List;

public interface GiftBoxOptions {

    Double calculateWeight(List<Candies>list);

    List<Candies> filters(List<Candies> list, boolean isFilteredByCost, boolean isFilteredByWeight);

    Double calculateAverageWeight(List<Candies>list);

}
