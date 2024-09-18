package maths;

class isPalindrome {
    public boolean isPalindrome(int x) {

        // reverse the number, and then check if both are equal

        int inputValue = Math.abs(x);
        int outputValue = 0;

        if(inputValue == 0) {
            return true;
        }

        while(inputValue > 0) {
            // get the last digit
            int lastDigit = inputValue % 10;
            // multiply
            outputValue = (outputValue * 10) + lastDigit;

            // update input value
            inputValue = (int) (inputValue / 10);
        }

        // bring back the negative value if it exists
        if(x < 0) {
            outputValue = outputValue * -1;
        }

        // compare x with output value

        if (x == outputValue) {
            if(x > 0) {
                return true;
            }
        }
        return false;

    }
}
