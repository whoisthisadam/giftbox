package by.bsuir.gift;


import by.bsuir.candies.Candies;
import by.bsuir.candies.Chocolate;
import by.bsuir.candies.Cookies;
import by.bsuir.candies.Marshmallow;
import by.bsuir.enums.ChocoTypes;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.RandomUtils;

import java.util.*;


@Data
@NoArgsConstructor
public class GiftBox implements GiftBoxOptions{





    public static List<Candies> createBox(){
        GiftBox giftBox = new GiftBox();
        ArrayList<Candies>list=giftBox.firstCollection();
        System.out.println("Here is your list:");
        System.out.println(list);
        System.out.println("Sum of weight:"+giftBox.calculateWeight(list));
        System.out.println("Average weight:"+giftBox.calculateAverageWeight(list));
        giftBox.filters(list);
        return list;
    }

    public void filters(List<Candies>list){
        String menu= """
                0-FINISH
                1-Filter elements which weight is more than average
                2-Undo filter No 1
                3-Sort by cost
                4-Undo sorting
                5-Undo all
                """;
        Scanner scanner=new Scanner(System.in);
        boolean exit=false;
        boolean isSorted=false;
        boolean isFiltered=false;
        while(!exit){
            System.out.println(menu);
            String option= scanner.nextLine();
            switch (option){
                case "0"->{
                    exit=true;
                }
                case "1"->{
                    isFiltered=true;
                    System.out.println("Filtered list:\n"+ filtersAndSort(list, isSorted, isFiltered));
                }
                case "2"->{
                    isFiltered=false;
                    System.out.println("Unfiltered list:\n"+ filtersAndSort(list, isSorted, isFiltered));
                }
                case "3"->{
                    isSorted=true;
                    System.out.println("Sorted list:\n"+ filtersAndSort(list,isSorted,isFiltered));
                }
                case "4"->{
                    isSorted=false;
                    System.out.println("Unsorted list:\n"+ filtersAndSort(list,isSorted,isFiltered));
                }
                case "5"->{
                    System.out.println("List:\n"+list);
                }
                default -> {
                    System.err.println("ERROR!\nYou are to choose numbers[0,1,2,3,4,5].\nTry again");
                }
            }
        }
    }




    @Override
    public Double calculateWeight(List<Candies> list) {
        return list.stream().map(Candies::getWeight).reduce(0.0, Double::sum);
    }



    @Override
    public List<Candies> filtersAndSort(List<Candies> list, boolean isSorted, boolean isFiltered) {
        if(isSorted)list=list.stream().sorted(Comparator.comparing(Candies::getCost)).toList();
        List<Candies> finalList = list;
        if(isFiltered)return list.stream().filter(x->x.getWeight()>=calculateAverageWeight(finalList)).toList();
        else return list;


    }

    @Override
    public Double calculateAverageWeight(List<Candies> list) {
        return calculateWeight(list)/ list.size();
    }


    public ArrayList<Candies> firstCollection(){
        ArrayList<Candies>list=new ArrayList<>();
        list.add(new Cookies("Oreo", RandomUtils.nextLong(1L,3000L), 12.32, "Cookies", RandomUtils.nextLong(1L,100L)));
        list.add(new Chocolate("Alpen Gold", RandomUtils.nextLong(1L, 1000L), RandomUtils.nextDouble(1.0,100.0), "Chocolate", ChocoTypes.MILK));
        list.add(new Marshmallow("BonPari",RandomUtils.nextLong(1L,1000L),RandomUtils.nextDouble(1.0,100.0),"Marshmallow", "Strawberry"));
        list.add(new Cookies("ChocoPie",RandomUtils.nextLong(1L,1000L),RandomUtils.nextDouble(1.0,100.0),"Cookies",RandomUtils.nextLong(1L,50L)));
        list.add(new Chocolate("Milka", RandomUtils.nextLong(1L, 1000L),RandomUtils.nextDouble(1.0,300.0),"Chocolate", ChocoTypes.DARK));
        return list;
    }

}
