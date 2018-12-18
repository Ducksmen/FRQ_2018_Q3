public class Bick_Runner {
    public static void main(String[] args)
    {
        StringChecker sc1 = new CodeWordChecker(0,100,"?");
        StringChecker sc2 = new CodeWordChecker("jojo");
        System.out.println(sc1.isValid("is that a jojo reference?"));
        System.out.println(sc2.isValid("is that a jojo reference?"));

        System.out.println(sc1.isValid("you thought it was a jojo reference, but it is I, dio"));
        System.out.println(sc2.isValid("you thought it was a jojo reference, but it is I, dio"));
    }
}
