public class lc5 {
    public static void main(String[] args) {
        String s = "racecar";
        int j = 0;
        String res = "";
        String longest = "";
        while (j <= s.length() - 1) {
            int count = 0;

            for (int i = j; i < s.length(); i++) {
                res += s.charAt(s.length() - i - 1);

                if (res.length() > count && s.equals(res)) {
                    longest = res;
                    count = longest.length();
                }
            }
            j++;
        }

    }
}
