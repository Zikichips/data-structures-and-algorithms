package maths;
// Given a number n. Count the number of digits in n which evenly divide n. Return an integer, total number of digits of n which divides n evenly.
//Note :- Evenly divides means whether n is divisible by a digit i.e. leaves a remainder 0 when divided.
//Examples :
//Input: n = 12
//Output: 2
//Explanation: 1, 2 when both divide 12 leaves remainder 0.

public class EvenlyDivides {
    static int evenlyDivides(int N) {
        // initialize the counter
        int newValue = N;
        int count = 0;
        //loop through n to get each digit.
        while (newValue > 0) {
            // for each digit, compare to see if mod division eq 0
            int singleValue = newValue % 10;
            // if so, increment count. Take note of when value is zero and exclude it
            if ((singleValue != 0) && (N % singleValue == 0)) {
                count++;
            }
            newValue = (int) (newValue / 10);
        }

        return count;
    }
}
