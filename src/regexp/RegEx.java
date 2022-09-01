package regexp;

public class RegEx {
    public static void main(String[] args) {
        /*
           \\d - одна цифра
           \\w - одна буква
           \\w = [a-zA-Z]

           + - 1 или более
           * - 0 или более
           ? - 0 или 1 символов до

           (x|y|z) - Одна строка из множества строк

           (a|b|c|d) = [abcd]

           [a-zA-Z] - все английские буквы
           [0-9] = \\d - все цифры от 0-9
           [^abc] - мы хотим все символы кроме abc

           . - любой символ
           $ - конец строки
           ^ - начало строки

           {2} - два символа до (\\d{2}) - две цифры
           {2, } - 2 или более символов (\\d{2, })
           {2, 4} - от двух до четырех символов (\\d{2, 4})
         */
        String a = "1";
        System.out.println(a.matches("\\d"));//Сравнивает строку и возварщает булеан

        String b = "-123";
        System.out.println(a.matches("-?\\d+"));

        String c = "+123";
        System.out.println(c.matches("(\\+|-)?\\d*"));

        String d = "dA19sd12345";
        System.out.println(d.matches("[a-zA-Z1-9]+\\d*"));

        String f = "abc";
        System.out.println(f.matches("[^abc]*"));

        String g = "http://www.google.ua";
        System.out.println(g.matches("http://www\\..+\\.(com|ru)"));

        String e = "123";
        System.out.println(e.matches("\\d{3}"));



    }
}
