package sorting;

public class InsertionSort {
    public void insertionSort(int arr[], int n)
    {
        //code here
        // Loop through each item
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 ; j--) {
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }

        }
        //
    }
}
