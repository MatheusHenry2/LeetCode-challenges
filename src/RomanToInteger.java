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
