package innerClass;

public class ElectroCar {
    private int id;
    //Non-static inner class
    private class Motor{
        public void startMotor(){
            System.out.println("Motor " + id + " is starting...");
        }
    }
    //static inner class
    public static class Battary{
        public void charge(){
            System.out.println("Battery is charging...");
        }
    }
    public ElectroCar(int id){
        this.id = id;
    }
    public void start(){
        int x = 5;
        Motor motor = new Motor();
        motor.startMotor();
        //inner class in method
        class SomeClass{
            public void someMethod(){
                System.out.println(id);
                System.out.println(x);
            }
        }
        SomeClass someClass = new SomeClass();
        someClass.someMethod();
        System.out.println("ElectroCar " + id + " is starting...");
    }
}
