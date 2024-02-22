//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//
//        Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
//For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
//
//Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//
//I can be placed before V (5) and X (10) to make 4 and 9.
//X can be placed before L (50) and C (100) to make 40 and 90.
//C can be placed before D (500) and M (1000) to make 400 and 900.
//Given a roman numeral, convert it to an integer.
//




public class RomanToInteger {

    public int romanToInt(String s) {
        int romanOutput = 0;
        for (int i = 0; i < s.length(); i++) {
            char romanChar = s.charAt(i);
            switch (romanChar) {
                case 'I':
                    if ((i + 1) < s.length()) {
                        char nextRomanChar = s.charAt(i + 1);
                        if (nextRomanChar == 'V') {
                            romanOutput = romanOutput + 4;
                            i++;
                        } else if (nextRomanChar == 'X') {
                            romanOutput = romanOutput + 9;
                            i++;
                        } else {
                            romanOutput = romanOutput + 1;
                        }
                    } else {
                        romanOutput = romanOutput + 1;
                    }
                    break;

                case 'V':
                    romanOutput = romanOutput + 5;
                    break;

                case 'X':
                    if ((i + 1) < s.length()) {
                        char nextRomanChar = s.charAt(i + 1);
                        if (nextRomanChar == 'L') {
                            romanOutput = romanOutput + 40;
                            i++;
                        } else if (nextRomanChar == 'C') {
                            romanOutput = romanOutput + 90;
                            i++;
                        } else {
                            romanOutput = romanOutput + 10;
                        }
                    } else {
                        romanOutput = romanOutput + 10;
                    }
                    break;

                case 'L':
                    romanOutput = romanOutput + 50;
                    break;

                case 'C':
                    if ((i + 1) < s.length()) {
                        char nextRomanChar = s.charAt(i + 1);
                        if (nextRomanChar == 'D') {
                            romanOutput = romanOutput + 400;
                            i++;
                        } else if (nextRomanChar == 'M') {
                            romanOutput = romanOutput + 900;
                            i++;
                        } else {
                            romanOutput = romanOutput + 100;
                        }
                    } else {
                        romanOutput = romanOutput + 100;
                    }
                    break;

                case 'D':
                    romanOutput = romanOutput + 500;
                    break;
                case 'M':
                    romanOutput = romanOutput + 1000;
                    break;
            }
        }
        return romanOutput;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("MCMXCIV"));
    }
}
