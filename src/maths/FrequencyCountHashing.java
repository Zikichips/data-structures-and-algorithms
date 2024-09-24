package maths;

public class FrequencyCountHashing {
    public static void frequencyCount(int arr[], int N, int P) {


        // Pre-store
        int secondArray[] = new int[P + N + 1];
        for (int i = 0; i < N; i++) {
            secondArray[arr[i]] += 1;
        }

        // Fetch
        for (int i = 0; i < N; i++) {
            arr[i] = secondArray[i + 1];
        }

    }
}
