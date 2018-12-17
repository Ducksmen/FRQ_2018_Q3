public class Runner {
    public static void main(String[] args) {
        StringChecker sc1 = new CodeWordChecker(6, 12, "$");
        StringChecker sc2 = new CodeWordChecker("pass");
        System.out.println(sc1.isValid("Banana$"));
        System.out.println(sc2.isValid("bananas"));
    }
}
