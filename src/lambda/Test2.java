package lambda;

public class Test2 {
    static void def(I i){
        System.out.println(i.abs("Privet"));
    }

    public static void main(String[] args) {
        def((String str) -> {return  str.length();});
    }

}
interface I{
    int abs(String s);
}
