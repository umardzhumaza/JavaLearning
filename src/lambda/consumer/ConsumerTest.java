package lambda.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerTest {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){
        ArrayList<Car> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(carSupplier.get());
        }
        return list;
    }
    public static void changeCar(Car car, Consumer<Car> cs){
        cs.accept(car);
    }
    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan","Black",1.6));//Поставляет объекты
        System.out.println("OurCars: " + ourCars);
        changeCar(ourCars.get(0),
                car -> {car.color="Red";
                        car.engine=2.4;
                    System.out.println("upgraded car: " + car);
                });
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
