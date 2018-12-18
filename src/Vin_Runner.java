public class Vin_Runner {
    public static void main(String[] args)
    {
        StringChecker sc1 = new CodeWordChecker(1, 5, "$");
        StringChecker sc2 = new CodeWordChecker("apple");
        System.out.println(sc1.isValid("orange"));
        System.out.println(sc2.isValid("apple"));
        System.out.println(sc1.isValid("apple"));
        System.out.println(sc2.isValid("orange"));
    }
}
