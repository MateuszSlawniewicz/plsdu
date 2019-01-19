package homeworkOOP;

public class Circle extends Figure {
    private Point p;
    private double r;

    public Circle(Point p, double r) {
        this.p = p;
        this.r = r;
    }


    @Override
    public String toString() {
        return "Pole koła wynosi: " + getArea() + "\nObwód koła wynosi: " + getCircuit();
    }

    @Override
    double getArea() {

        return Math.PI * Math.pow(r, 2);
    }

    @Override
    double getCircuit() {
        return Math.PI * 2 * r;
    }

    @Override
    Point[] getEdges() {
        Point p1 = p;
        Point[] points = new Point[]{p1};
        return points;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

}
