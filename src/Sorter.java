import java.util.Random;

public class Sorter {
    void BubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    void QuickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    private void quickSort(int[] arr, int from, int to){
        if(from < to) {
           int pivot = partition(arr, from, to);
           quickSort(arr, from, pivot - 1);
           quickSort(arr, pivot + 1, to);
        }
    }
    private int partition(int[] arr, int from, int to) {
        int pivot = arr[to];
        int i = (from - 1);
        for(int j = from; j < to; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[to];
        arr[to] = temp;
        return i + 1;
    }
    public void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
