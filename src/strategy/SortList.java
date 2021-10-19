package strategy;

import java.util.List;

public class SortList {
    private SortStrategy strategy;
    private List<Integer> integers;

    public void sort(){
        strategy.sort(integers);
    }

    public SortStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Integer> getIntegers() {
        return integers;
    }

    public void setIntegers(List<Integer> integers) {
        this.integers = integers;
    }
}
