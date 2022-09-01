package work_with_binaryFiles.serialization.programmer2;

import work_with_binaryFiles.serialization.programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serialization2 {
    public static void main(String[] args) {
        Employee bestEmployee;
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employee.bin"))){
            bestEmployee = (Employee) inputStream.readObject();
            System.out.println(bestEmployee);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
