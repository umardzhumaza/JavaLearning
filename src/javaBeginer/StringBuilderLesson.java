package javaBeginer;

public class StringBuilderLesson {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        sb.append(" my").append(" friend").append("!");
        System.out.println(sb.toString());

        System.out.printf("This is test: %-10d %s\n",123 , "row");
        System.out.printf("This is test: %.2f\n",54.33789);
        System.out.printf("This is test: %-10d\n",1234567890);

    }
}
