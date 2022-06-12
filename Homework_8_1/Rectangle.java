package Homework_8_1;

public class Rectangle extends Circle {
    public double width = 0;
    public double length= 0;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public Boolean getFilled() {
        return super.getFilled();
    }

    @Override
    public void setFilled(Boolean filled) {
        super.setFilled(filled);
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }
}