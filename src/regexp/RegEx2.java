package regexp;

import java.util.Arrays;

public class RegEx2 {
    public static void main(String[] args) {
        String a = "Hello.there.hey";
        String[] words = a.split("\\.");//разделяет строку по точкам
        System.out.println(Arrays.toString(words));

        String b = "Hello123124there23423525hey";
        String[] words2 = b.split("\\d+");
        System.out.println(Arrays.toString(words2));

        String c = "Hello1233434there12312412414hey";
        String modifiedString = c.replaceAll("\\d+",".");//replace не принимает на вход regex выражения, replaceAll принимает.
        System.out.println(modifiedString);

        String e = "Hello123124there12312414hey";
        String modifiedString2 = e.replaceFirst("\\d+","-");
        System.out.println(modifiedString2);
    }
}
