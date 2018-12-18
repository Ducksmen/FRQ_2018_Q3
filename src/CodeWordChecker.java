/**
 * 2018 FRQ Question from the AP Java Course.
 */
public class CodeWordChecker implements StringChecker {
    // Fields

    // Minimum Length of the given String.
    private int min;
    // Maximum Length of the given String.
    private int max;
    // The String that needs to be checked.
    private String word;

    /**
     * Main Constructor.
     * @param min Integer representing the minimum length of String word.
     * @param max Integer representing the maximum length of String word.
     * @param word String that is to be checked.
     */
    public CodeWordChecker(int min, int max, String word)
    {
        this.min = min;
        this.max = max;
        this.word = word;
    }

    /**
     * Alternative Constructor.
     * Sets the minimum length to 6, and maximum to 20.
     * @param word String that is to be checked.
     */
    public CodeWordChecker(String word)
    {
        min = 6;
        max = 20;
        this.word = word;
    }

    /**
     * @param str String to be checked.
     * @return True if the String is greater than or equal to minimum length and is less than the maximum length,
     *         as well as if the string does not contain word (The substring).
     */
    @Override
    public boolean isValid(String str) {
        return str.length() >= min && str.length() <= max && !str.contains(word);
    }
}
