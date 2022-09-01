package work_with_binaryFiles.serialization.programmer1;

import java.io.Serializable;

public class Car implements Serializable {
    String model;
    String color;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
}
