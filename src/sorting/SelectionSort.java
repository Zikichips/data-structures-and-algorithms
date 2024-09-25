package sorting;

public class SelectionSort {
    void selectionSort(int arr[], int n)
    {

        // loop through each
        // initialize a min index
        // create an inner loop to compare
        // compare each value with value of min index
        // swap

        for (int i = 0; i < n - 1; i++) {
            // index value of min that will be updated
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swapping
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
