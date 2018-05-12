public class SelectionSort {
    private final int[] input;

    public SelectionSort(int[] input) {
        this.input = input;
    }

    public static void main(String[] args) {
        int input[] = {23, 45, -34, 12, 0, 98, -99, 4, 189, -1, 4};
        SelectionSort selectionSort = new SelectionSort(input);
        selectionSort.sort();
    }

    private void sort() {
        for (int i = 0; i < input.length; i++) {
            int minValue = input[i];
            int minValueIndex = i;

            for (int j = i; j < input.length; j++) {
                if(input[j] < minValue) {
                    minValue = input[j];
                    minValueIndex = j;
                }
            }
            swap(i, minValueIndex);
        }
        printSolution();
    }

    private void printSolution() {
        for (int item: input) {
            System.out.print(item+ " ");
        }
    }

    private void swap(int currentIndex, int minValueIndex) {
        int temp = input[currentIndex];
        input[currentIndex] = input[minValueIndex];
        input[minValueIndex] = temp;
    }
}
