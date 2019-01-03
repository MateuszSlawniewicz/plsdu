package HelionJava;

public class RectangleHelion {

    private double heigth;
    private double length;


    public double rectangleArea() {
        return heigth * length;

    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Dlugosc boku a wynosi " + heigth + ", dlugosc boku b wynosi " + length;
    }
}
