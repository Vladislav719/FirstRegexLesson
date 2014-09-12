import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by vladislav on 08.09.14.
 */
public class Main {

    private static final String URL_PATTERN = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
    private static final String POST_MAIL_PATTERN = "(^\\d{4,6})$";
    private static final String HEX_METRIC_PATTERN = "(?i)(0x)?[0-9a-f]+";
    private static final String PASSWORD_CASE_1 = "^\\d{8,32}$";
    private static final String PASSWORD_CASE_2 = ".*[A-F]+.*";
    private static final String PASSWORD_CASE_3 = ".*[a-f]+.*";
    private static final String PASSWORD_CASE_4 = ".*[0-9]+.*";
    private static final String PASSWORD_CASE_5 = ".*[+&@#/%?=~_|!:,.;]+.*";

    protected static List<String> patternsList = new ArrayList<String>();
    private static List<String> inputTest = new ArrayList<String>();


    public static void main(String[] args) {
//        Pattern p = Pattern.compile("[01]0(?!0)");
//        Pattern p = Pattern.compile(URL_PATTERN);
//        System.out.println(RegexTest.checker("http://google.com/", p.pattern()));
//        p = Pattern.compile(POST_MAIL_PATTERN);
//        System.out.println(RegexTest.checker("538855",p.pattern()));
//        p = Pattern.compile(HEX_METRIC_PATTERN);
//        System.out.println(RegexTest.checker("0x0f4", p.pattern()));
//        p = Pattern.compile(PASSWORD_CASE_1);
//        System.out.println(RegexTest.checker("7472604156", p.pattern()));
//        p = Pattern.compile(PASSWORD_CASE_2);
//        System.out.println(RegexTest.checker("F", p.pattern()));
//        p = Pattern.compile(PASSWORD_CASE_3);
//        System.out.println(RegexTest.checker("fasdasFFASFD1231", p.pattern()));
//        p = Pattern.compile(PASSWORD_CASE_4);
//        System.out.println(RegexTest.checker("asdasd2",p.pattern()));
//        p = Pattern.compile(PASSWORD_CASE_5);
//        System.out.println(RegexTest.checker("asd_",p.pattern()));

        patternsList.add(URL_PATTERN);
        patternsList.add(PASSWORD_CASE_1);
        patternsList.add(PASSWORD_CASE_2);
        patternsList.add(PASSWORD_CASE_3);
        patternsList.add(PASSWORD_CASE_4);
        patternsList.add(PASSWORD_CASE_5);
        patternsList.add(POST_MAIL_PATTERN);
        patternsList.add(HEX_METRIC_PATTERN);

        inputTest.add("http://vk.com/");
        inputTest.add("http://google.com/");
        inputTest.add("http://russianaicup.ru/");
        inputTest.add("http://twitter.com/");
        inputTest.add("2380472");
        inputTest.add("12312");
        inputTest.add("18392");
        inputTest.add("134312");
        inputTest.add("0x0D3");
        inputTest.add("0x0f5");
        inputTest.add("0xffffffff");
        inputTest.add("0x3F7A");
        inputTest.add("1231");
        inputTest.add(";1l231");

        RegexTest.checker(inputTest.toArray(new String[inputTest.size()]), patternsList.toArray(new String[patternsList.size()]));

    }

}
