public class BubbleSort {
    private final int[] input;

    public BubbleSort(int[] input) {
        this.input = input;
    }

    public static void main(String[] args) {
        int input[] = {23, 45, -34, 12, 0, 98, -99, 4, 189, -1, 4};
        BubbleSort bubbleSort = new BubbleSort(input);
        bubbleSort.sort();
        bubbleSort.printSolution();
    }

    private void printSolution() {
        for (int item: input) {
            System.out.print(item+ " ");
        }
    }

    private void sort() {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if(input[j] > input[j+1]) {
                    swap(j, j+1);
                }
            }
        }
    }

    private void swap(int currentIndex, int minValueIndex) {
        int temp = input[currentIndex];
        input[currentIndex] = input[minValueIndex];
        input[minValueIndex] = temp;
    }
}
