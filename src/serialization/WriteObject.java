package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(5,"Bob",180);
        Person person2 = new Person(10, "Alex",190);
        Person[] personArray = {new Person(1,"Jim",175),new Person(2, "Elena",173),new Person(3, "Robert",183)};

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))){
            //First option serialize array with cycle
            oos.writeInt(personArray.length);
            for (Person person:personArray
                ) {
                   oos.writeObject(person);
                }
             //second option serialize array like object
             oos.writeObject(personArray);
             oos.writeObject(person1);
             oos.writeObject(person2);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
