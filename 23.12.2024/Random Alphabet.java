public class RandomAlphabet {
    public static char getRandomAlphabet() {
        Random random = new Random();
        return (char) (random.nextInt(26) + 'a');
    }

    public static void main(String[] args) {
        System.out.println("Random alphabet: " + getRandomAlphabet());
    }
}
