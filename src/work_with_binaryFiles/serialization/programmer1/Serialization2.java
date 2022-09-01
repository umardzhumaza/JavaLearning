package work_with_binaryFiles.serialization.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization2 {
    public static void main(String[] args) {
        Car car = new Car("Model X","White");
        Employee employee = new Employee(
                "Ivanova",
                "Мария","IT",
                24,
                500,car );
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employee.bin"))){
            outputStream.writeObject(employee);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
