public class BrianRunner {
    public static void main(String[] args) {
        CodeWordChecker newChecker = new CodeWordChecker(5, 15, "cellphone");
        String str1 = "1cellphone";
        String str2 = "phone";
        String str3 = "";
        System.out.println(newChecker.isValid(str1));
        System.out.println(newChecker.isValid(str2));
        System.out.println(newChecker.isValid(str3));
    }
}
