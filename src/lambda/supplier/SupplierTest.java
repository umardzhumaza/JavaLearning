package lambda.supplier;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierTest {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){
           ArrayList<Car> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(carSupplier.get());
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan","Black",1.6));//Поставляет объекты
        System.out.println("OurCars: " + ourCars);
    }
}
class Car{
    String model;
    String color;
    double engine;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }
}
