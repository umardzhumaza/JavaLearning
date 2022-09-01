package Enum;

public enum Season {
    SUMMER(30),
    WINTER(-30),
    AUTUMN(10),
    SPRING(20);

    private int temperature;
    Season(int temperature){
         this.temperature = temperature;
    }
    public int getTemperature(){
        return temperature;
    }

//    @Override
//    public String toString() {
//        return "Температура в это время года: " + temperature;
//    }
}
