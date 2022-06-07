package Homework_7_1;


public class Car {

    private String str;
    private String carName = isNullEmpty(str);
    private String carColor = isNullEmpty(str);
    private Integer y = 0;
    private Integer releaseYear = isNullEmpty1(y);

    private Integer horsePower = isNullEmpty1(y);
    private boolean sec;
    private boolean secondHand = sec;
    private static String isNullEmpty(String str) {

        if (str == null || str.isEmpty()) {
            return "N/A";
        } else {
            return str;
        }}



       private static Integer isNullEmpty1(Integer y){

           if (y.equals(0)) {
               return -1;
           } else {
                return y;
            }}

    private static Boolean isSecondHand (Boolean sec) {

if (sec != true) {
    return sec = false;
}
else {return true;
            }}

    public Car(String carName, String carColor, Integer releaseYear, Integer horsePower, boolean secondHand) {
        this.carName = carName;
        this.carColor = carColor;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHand;
    }

    public Car(String carName, String carColor, boolean secondHand) {
        this.carName = carName;
        this.carColor = carColor;
        this.secondHand = secondHand;
    }

    public Car(String carName, String carColor, Integer releaseYear, Integer horsePower) {
        this.carName = carName;
        this.carColor = carColor;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
    }

    public Car(String carName, Integer releaseYear, Integer horsePower, boolean secondHand) {
        this.carName = carName;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
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
                ", horsePower=" + horsePower +
                ", secondHand=" + secondHand +
                '}';
    }
}

