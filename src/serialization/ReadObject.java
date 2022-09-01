package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("people.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        //First option deserialize array with cycle
        int countPerson = ois.readInt();
        Person[] personArray = new Person[countPerson];
        for (int i = 0; i < countPerson; i++) {
            personArray[i] = (Person) ois.readObject();
        }
            System.out.println(Arrays.toString(personArray));
        //second option deserialize array like object
        Person[] arrayPerson = (Person[])ois.readObject();
        System.out.println(Arrays.toString(arrayPerson));
        Person person1 = (Person) ois.readObject();
        Person person2 = (Person) ois.readObject();

        System.out.println(person1);
        System.out.println(person2);

        ois.close();

    }
}
