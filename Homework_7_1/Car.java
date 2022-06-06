package Homework_7_1;

public class Car {

    private String carName = null;
    private String carColor = null;
    private Integer releaseYear = 0;
    private Integer horsePowers = 0;
    private Boolean secondHand = new Boolean("true");


    public Car(String carName) {
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

    public Car(String audi, String black, String aFalse) {
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

    public void setSecondHand(Boolean secondHand) {
        this.secondHand = secondHand;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Integer getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(Integer horsePowers) {
        this.horsePowers = horsePowers;
    }

    public Boolean getSecondHand() {
        if ( secondHand != true) {
            System.out.println("false");
        }
        return secondHand;


    }
}



