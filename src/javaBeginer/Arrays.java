package javaBeginer;

public class Arrays {
    public static void main(String[] args) {

        String[][] str = {{"Привет","Мир","!"},
                {"Меня","Зовут","Умар"},
                {"Как","Зовут","Тебя?"}};

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                System.out.print(str[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
