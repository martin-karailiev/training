package Homework_7_1;

public class Car {

    private String carName = null;
    private String carColor = null;
    private Integer releaseYear = 0;
    private Integer horsePowers = 0;
    private Boolean secondHand;


    public Car(String carName, String carColor, Integer releaseYear, Integer horsePowers, Boolean secondHand) {
        this.carName = carName;
        this.carColor = carColor;
        this.releaseYear = releaseYear;
        this.horsePowers = horsePowers;
        this.secondHand = secondHand;
    }

    public Car(String carName, String carColor, Boolean secondHand) {
        this.carName = carName;
        this.carColor = carColor;
        this.secondHand = secondHand;
    }

    public Car(String carName, String carColor, Integer releaseYear, Integer horsePowers) {
        this.carName = carName;
        this.carColor = carColor;
        this.releaseYear = releaseYear;
        this.horsePowers = horsePowers;
    }

    public Car(String carName, Integer releaseYear, Integer horsePowers, Boolean secondHand) {
        this.carName = carName;
        this.releaseYear = releaseYear;
        this.horsePowers = horsePowers;
        this.secondHand = secondHand;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carColor='" + carColor + '\'' +
                ", releaseYear=" + releaseYear +
                ", horsePowers=" + horsePowers +
                ", secondHand=" + secondHand +
                '}';
    }
}



