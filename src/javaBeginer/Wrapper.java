package javaBeginer;

public class Wrapper {
    public static void main(String[] args) {
        //Классы обертки
        Integer x = 128; //boxing Авто-упаковка
        Integer x2 = 128;
        int x3 = x; //unboxing Авто-распаковка

        System.out.println(x.equals(x2));
        System.out.println(x.compareTo(x2));
        System.out.println(x.hashCode());
        System.out.println(Boolean.FALSE);
    }
}
