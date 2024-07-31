package structural.strategy.sorting;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 7, 8, 4, 6};
        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
        sortingContext.sort(arr);
        sortingContext = new SortingContext(new MergeSortStrategy());
        sortingContext.sort(arr);
        sortingContext = new SortingContext(new QuickSortStrategy());
        sortingContext.sort(arr);
    }
}
