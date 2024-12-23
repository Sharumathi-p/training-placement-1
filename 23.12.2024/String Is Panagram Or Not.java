public class PangramCheck {
    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        HashSet<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                set.add(c);
            }
        }
        return set.size() == 26;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println("\"" + str + "\" is a pangram: " + isPangram(str));
    }
}
