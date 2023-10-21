public class PangramCheck {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = checkIfPangram(input);
        System.out.println(isPangram);
    }

    private static boolean checkIfPangram(String s) {
        boolean[] mark = new boolean[26];
        int index;
        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                index = s.charAt(i) - 'A';
            } else if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                index = s.charAt(i) - 'a';
            } else {
                continue;
            }
            mark[index] = true;
        }
        for (int i = 0; i < 26; i++) {
            if (!mark[i]) {
                return false;
            }
        }
        return true;
    }
}
