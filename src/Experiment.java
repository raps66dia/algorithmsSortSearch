public class Experiment {
    private Sorter sorter = new Sorter();
    private Searcher searcher = new Searcher();

    public long measureSortTime(int[] arr, String type) {
        long startTime = System.nanoTime();

        if(type.equalsIgnoreCase("basic")) {
            sorter.BubbleSort(arr);
        } else if (type.equalsIgnoreCase("advanced")){
            sorter.QuickSort(arr);
        }

        long endTime = System.nanoTime();
        return (endTime - startTime);
    }
    public long measureSearchTime(int[] arr, int target) {
        sorter.QuickSort(arr);

        long startTime = System.nanoTime();
        searcher.searcher(arr, target);
        long endTime = System.nanoTime();

        return (endTime - startTime);
    }
    public void runAllExperiments() {
        int[] sizes = {100, 1000, 5000};

        for(int size : sizes) {
            int[] arr1 = sorter.generateRandomArray(size);
            int[] arr2 = arr1.clone();
            int[] arr3 = arr1.clone();

            long basicTime = measureSortTime(arr1, "basic");
            long advancedTime = measureSortTime(arr2, "advanced");
            long searchTime = measureSearchTime(arr3, -1); // для самого худшего случая

            System.out.println("Size of array | Basic Sort time | Advanced time | Search time | " + '\n' + size + '|' + basicTime + '|' + advancedTime + '|' + searchTime);
        }
    }
}
