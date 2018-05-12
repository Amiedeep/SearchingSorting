public class QuickSort {
    private int[] input;

    public QuickSort(int[] input) {
        this.input = input;
    }

    public static void main(String[] args) {
        int input[] = {23, 45, -34, 12, 0, 98, -99, 4, 189, -1, 4};
        QuickSort quickSort = new QuickSort(input);
        quickSort.sort(0, input.length - 1);
        quickSort.printSolution();
    }

    private void sort(int startIndex, int endIndex) {
        if(startIndex < endIndex) {
            int pivotIndex = findPivot(startIndex, endIndex);
            sort(startIndex, pivotIndex - 1);
            sort(pivotIndex + 1, endIndex);
        }
    }

    private int findPivot(int startIndex, int endIndex) {
        int pivotItem = input[startIndex];

        int pivotIndex = startIndex;

        for (int i = startIndex + 1; i <= endIndex; i++) {
            if(input[i] <= pivotItem) {
                pivotIndex++;
                swap(pivotIndex, i);
            }
        }
        input[startIndex] = input[pivotIndex];
        input[pivotIndex] = pivotItem;
        return pivotIndex;
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
