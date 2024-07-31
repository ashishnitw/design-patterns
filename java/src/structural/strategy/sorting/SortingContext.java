package structural.strategy.sorting;

public class SortingContext {
    private SortingStrategy sortingStrategy;

    public SortingContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void sort(int[] arr) {
        sortingStrategy.sort(arr);
    }
}
