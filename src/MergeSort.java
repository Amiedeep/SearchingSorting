import java.util.Arrays;

public class MergeSort {
    private int[] input;

    public MergeSort(int[] input) {
        this.input = input;
    }

    public static void main(String[] args) {
        int input[] = {23, 45, -34, 12, 0, 98, -99, 4, 189, -1, 4};
        MergeSort mergeSort = new MergeSort(input);
        mergeSort.sort(0, input.length - 1);
        mergeSort.printSolution();
    }

    private void sort(int startIndex, int endIndex) {
        if(startIndex < endIndex) {
            int midIndex = (startIndex + endIndex)/2;
            sort(startIndex, midIndex);
            sort(midIndex + 1, endIndex);
            merge(startIndex, endIndex, midIndex);
        }
    }

    private void merge(int startIndex, int endIndex, int midIndex) {
        int j = 0;
        int k = 0;
        int i = startIndex;

        int l[] = Arrays.copyOfRange(input, startIndex, midIndex + 1);
        int r[] = Arrays.copyOfRange(input, midIndex + 1, endIndex + 1);

        while(j < l.length && k < r.length) {
            if(l[j] <= r[k]) {
                input[i] = l[j];
                j++;
            }
            else {
                input[i] = r[k];
                k++;
            }
            i++;
        }
        while(j < l.length) {
            input[i] = l[j];
            j++;
            i++;
        }

        while(k < r.length) {
            input[i] = r[k];
            k++;
            i++;
        }
    }

    private void printSolution() {
        for (int item: input) {
            System.out.print(item+ " ");
        }
    }
}
