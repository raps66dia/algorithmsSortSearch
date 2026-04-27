import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        Experiment exp = new Experiment();
        Searcher searcher = new Searcher();
        Scanner sc = new Scanner(System.in);
        System.out.print("Write size of array: ");
        int size = sc.nextInt();
        sc.nextLine();
        int[] myArr = sorter.generateRandomArray(10);

        boolean running = true;
        while (running) {
            System.out.println("1. Print array");
            System.out.println("2. Quick sort");
            System.out.println("3. Bubble sort");
            System.out.println("4. Search element after sort");
            System.out.println("5. Run Expirement");
            System.out.println("6. Create Sorted Array");
            System.out.println("0. Exit");
            System.out.println("Enter action: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    sorter.printArr(myArr);
                    break;
                case 2:
                    sorter.QuickSort(myArr);
                    break;
                case 3:
                    sorter.BubbleSort(myArr);
                    break;
                case 4:
                    System.out.print("Element for searching: ");
                    int target = sc.nextInt();
                    sc.nextLine();
                    searcher.searcher(myArr, target);
                    break;
                case 5:
                    exp.runAllExperiments();
                    break;
                case 6:
                    myArr = createSorted();
                    break;
                default:
                    System.out.println("Invalid action");
                    break;
                case 0:
                    running = false;
                    return;
            }
        }
    }
    public static int[] createSorted() {
        System.out.print("Size of arr: ");
        int size1 = sc.nextInt();
        int[] sortedArr = new int[size1];
        sc.nextLine();
        for (int i = 0; i < sortedArr.length; i++) {
            sortedArr[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println();
        return sortedArr;
    }
}

