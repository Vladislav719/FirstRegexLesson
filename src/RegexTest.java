/**
 * Created by vladislav on 08.09.14.
 */
public class RegexTest {

    private RegexTest(){}

    public static boolean checker(String str, String regex) {
        return str.matches(regex);
    }

    public static void checker(String str, String[] regex) {
        for (String x : regex)
            System.out.println(checker(str, x));
    }

    public static void checker(String[] str, String regex[]) {
        for (String x : str)
            checker(x, regex);
    }
}
