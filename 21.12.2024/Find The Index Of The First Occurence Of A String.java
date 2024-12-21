public class StrStr {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println("Index of first occurrence: " + strStr(haystack, needle));
    }
}
