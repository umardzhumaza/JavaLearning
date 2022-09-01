package javaBeginer;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(Factorial(10));
    }
    private static int factorial(int value){
       if (value == 1)
           return 1;
       return value * factorial(value - 1);
    }
    private static void counter(int n){
        if (n == 0)
            return;
        System.out.println(n);

        counter(n-1);//Counter(5) -> Counter(4) -> Counter(3) -> Counter(2) -> Counter(1) -> Counter(0)
                        //  wait     ->    wait    ->   wait     ->   wait     ->   wait     ->    end
                        //Method finished = First in last out Counter(1) -> Counter(2) -> Counter(3) -> Counter(4) -> Counter(5)
    }
    public static int Factorial(int num)
    {
        int fact = 1;
        while (num > 1) fact *= num--;
        return fact;
    }
}
