package javaBeginer;

public class StringPoolEquals {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);

        System.out.println(animal1.equals(animal2));
        String str1 = "Hello";
        String str2 = "Hello"; //Two same String crated StringPool and have two path for one same object in memory;
        System.out.println(str1.equals(str2)); //Recommended
        System.out.println(str1 == str2); //NotRecommended
    }
}
class Animal{
    public Animal(int id){
        this.id = id;
    }
    private int id;
    public boolean equals(Object obj){
        Animal animal = (Animal) obj;
        return this.id == animal.id;
    }
}
