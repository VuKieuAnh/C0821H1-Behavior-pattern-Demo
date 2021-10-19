package strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        SortList sortList = new SortList();
        sortList.setIntegers(integers);

        SelectionSort selectionSort = new SelectionSort();
        sortList.setStrategy(selectionSort);
        sortList.sort();

        sortList.setStrategy(new QuickSort());
        sortList.sort();
    }
}
