package serialization;

import java.io.Serializable;

public class Person implements Serializable {

    private transient int id; //transient is key word for not serialize this field
    private String name;
    private double height;
    public Person(int id, String name,double height){
        this.id = id;
        this.name = name;
        this.height= height;
    }
    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return id + " : " + name + " : " + height;
    }
}
