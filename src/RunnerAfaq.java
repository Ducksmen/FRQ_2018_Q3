// Afaq Anwar

/**
 * Method Tester for CodeWordChecker.
 */
public class RunnerAfaq {
    public static void main(String[] args) {
        CodeWordChecker newChecker = new CodeWordChecker(1, 20, "carrot");
        String str1 = "carrotcake";
        String str2 = "cake";
        String str3 = "";
        System.out.println(newChecker.isValid(str1));
        System.out.println(newChecker.isValid(str2));
        System.out.println(newChecker.isValid(str3));
    }
}
