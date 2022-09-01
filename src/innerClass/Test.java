package innerClass;

public class Test {
    public static void main(String[] args) {
        ElectroCar electroCar = new ElectroCar(1);
        electroCar.start();
        ElectroCar.Battary battary = new ElectroCar.Battary();
        battary.charge();

    }
}
