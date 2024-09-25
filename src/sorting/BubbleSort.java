package sorting;

public class BubbleSort {
    public static void bubbleSort(int arr[], int n)
    {
        //code here
        // loop through each array from n - 1 to 1
        for (int i = n - 1; i >= 1; i--) {

            for (int j = 0; j < i; j++) {
                // compare each pair of numbers
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
        }
    }
}
