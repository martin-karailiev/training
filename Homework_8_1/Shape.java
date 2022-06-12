package Homework_8_1;

abstract class Shape {
    public String color;
    public boolean filled;

    public abstract double getArea();
    public abstract double getPerimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }
}
