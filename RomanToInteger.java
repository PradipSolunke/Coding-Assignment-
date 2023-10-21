public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "IX";
        int result = romanToInteger(roman);
        System.out.println(result);
    }

    private static int romanToInteger(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && charToInt(s.charAt(i)) > charToInt(s.charAt(i - 1))) {
                res += charToInt(s.charAt(i)) - 2 * charToInt(s.charAt(i - 1));
            } else {
                res += charToInt(s.charAt(i));
            }
        }
        return res;
    }

    private static int charToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
