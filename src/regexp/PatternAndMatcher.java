package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {
    public static void main(String[] args) {
        String text = "Hello, Guys! I send you my mail joe@gmail.com so we can\n" +
                "keep in touch. Thanks, Joe! That's cool. I am sending you\n" +
                "my address: tim@yandex.ru. Let's stay in touch...";

        //pattern factory meth
        Pattern email = Pattern.compile("(\\w+)@(gmail|yandex)\\.(com|ru)");// () - это группы (\\w+) - айди 1
        Matcher matcher = email.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());//возвращает то что было найдено с помощью find, в параметрах принмает айди группы которую хотим получить
        }
    }
}
