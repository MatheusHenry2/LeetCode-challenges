//7. Reverse Integer
//Solved
//        Medium
//Topics
//        Companies
//Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//
//Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
//

//Example 1:
//
//Input: x = 123
//Output: 321
//Example 2:
//
//Input: x = -123
//Output: -321
//Example 3:
//
//Input: x = 120
//Output: 21
//
//
//Constraints:
//
//        -231 <= x <= 231 - 1



public class ReverseInteger {

    public int reverse(int x) {

        String xText = Integer.toString(x);
        int timesLoop = 0;
        if (xText.charAt(0) == '-') {
            timesLoop = 1;
        }

        try {
            StringBuilder xTextInverse = new StringBuilder();
            for (int i = xText.length() - 1; i >= timesLoop; i--) {
                xTextInverse.append(xText.charAt(i));
            }

            if (timesLoop == 1) {
                return ((Integer.parseInt(xTextInverse.toString())) * -1);
            }

            return Integer.parseInt(xTextInverse.toString());
        } catch (NumberFormatException e) {
            return 0;
        }

    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(9646324351));
    }

}

