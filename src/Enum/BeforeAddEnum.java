package Enum;

public class BeforeAddEnum {
    private static final int DOG = 0;
    private static final int CAT = 1;
    private static final int FROG = 2;
    private static final int BEAR = 3;

    public static void main(String[] args) {
        int animal = BEAR;

        switch (animal){
            case DOG:
                System.out.println("It's a dog");
                break;
            case CAT:
                System.out.println("It's a cat");
                break;
            case FROG:
                System.out.println("It's a frog");
                break;
            case BEAR:
                System.out.println("It's a bear");
                break;
            default:
                System.out.println("It's not an animal!");
        }
    }
}
