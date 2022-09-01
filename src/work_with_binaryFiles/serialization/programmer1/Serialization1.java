package work_with_binaryFiles.serialization.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serialization1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Dzhumaza Umar");
        employees.add("Elena");
        employees.add("Ivan");
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees.bin"))) {
            outputStream.writeObject(employees);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
