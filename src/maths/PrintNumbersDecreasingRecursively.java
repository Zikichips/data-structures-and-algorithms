package maths;

public class PrintNumbersDecreasingRecursively {
    int count = 0;


    void printNos(int N) {
        // code here

        if (N - count == 0) {
            return;
        }

        System.out.print((N - count) + " ");
        count++;

        printNos(N);
    }
}
