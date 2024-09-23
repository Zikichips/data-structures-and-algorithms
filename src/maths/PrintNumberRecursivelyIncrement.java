package maths;

public class PrintNumberRecursivelyIncrement {

    int count = 1;

    public void printNos(int N) {
        //Your code here
        System.out.print(count + " ");
        if (count == N) {
            return;
        }
        count++;
        printNos(N);

    }
}
