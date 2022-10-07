package by.bsuir.gift;

import by.bsuir.candies.Candies;

import java.util.List;

public interface GiftBoxOptions {

    Double calculateWeight(List<Candies>list);

    List<Candies> filtersAndSort(List<Candies> list, boolean isSorted, boolean isFiltered);

    Double calculateAverageWeight(List<Candies>list);

}
