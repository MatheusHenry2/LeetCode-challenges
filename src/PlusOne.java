import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        if (digits.length == 1) {
            if (digits[0] == 9) {
                return new int[]{1, 0};
            } else {
                return new int[]{digits[0] = digits[0] + 1};
            }
        } else {
            if (digits[digits.length - 1] == 9) {
                int[] newArray = new int[digits.length + 1];
                for (int i = 0; i < digits.length + 1; i++) {
                    if (i == digits.length - 1) {
                        newArray[i] = 1;
                    } else if (i == digits.length) {
                        newArray[i] = 0;
                    } else {
                        newArray[i] = digits[i];
                    }
                }
            } else {
                digits[digits.length - 1] = digits[digits.length - 1] + 1;
            }
        }


        return digits;
    }

    public static void main(String[] args) {
        int[] firstArray = {9};
        PlusOne plusOne = new PlusOne();
        System.out.println(Arrays.toString(plusOne.plusOne(firstArray)));
    }

}



