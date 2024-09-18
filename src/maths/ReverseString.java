package maths;

class ReverseString {
    public int reverse(int x) {

        int inputValue = Math.abs(x);
        int outputValue = 0;
        while (inputValue > 0) {
            // pick the last digit
            int remainderValue = inputValue % 10;

            // multiply
            outputValue = outputValue * 10 + remainderValue;

            // update input value
            inputValue = (int) (inputValue / 10);
        }

        // include the negative if the original value is negative
        if(x < 0) {
            outputValue = outputValue * -1;
        }
        return outputValue;
    }
}
