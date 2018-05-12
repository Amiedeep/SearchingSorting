public class BinarySearch {

    private final int[] input;

    public BinarySearch(int[] input) {
        this.input = input;
    }

    public static void main(String[] args) {
        int input[] = {1, 2, 4, 6, 10, 45, 67, 578, 5789, 562889};

        BinarySearch binarySearch = new BinarySearch(input);

        binarySearch.find(10);
        binarySearch.find(45);
        if(!binarySearch.find(66))
            System.out.println("Item not found");

    }

    private boolean find(int item) {
        int startIndex = 0;
        int endIndex = input.length - 1;
        boolean itemFound = false;

        while(startIndex <= endIndex) {
         int mid = (endIndex+startIndex)/2;
         if(input[mid] == item) {
             System.out.println("Item found at index: " +mid);
             itemFound = true;
             break;
         }
         else if(input[mid] < item)
             startIndex = mid+1;
         else
             endIndex = mid-1;
        }
        return itemFound;

    }
}
