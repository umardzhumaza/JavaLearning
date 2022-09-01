package Enum;

public enum Animal {
    DOG("Собака"),
    CAT("Кошка"),
    FROG("Лягушка"),
    BEAR("Медведь");
    private String translation;
    Animal(String translation){
        this.translation = translation;
    }
    public String getTranslation(){
        return translation;
    }
    @Override
    public String toString() {
        return  "Перевод на русский: " + translation;
    }
}

