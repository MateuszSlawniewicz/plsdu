package homeworkOOP;

public class Square extends Figure {
    private Point p;
    private double side;

    public Square(Point p, double side) {
        this.p = p;
        this.side = side;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    double getArea() {
        return side*side;
    }

    @Override
    double getCircuit() {
        return side*4;
    }

    @Override
    Point[] getEdges() {
        Point p1 = p;
        Point p2 = new Point(p.getX() + side, p.getY());
        Point p3 = new Point(p.getX() + side, p.getY() + side);
        Point p4 = new Point(p.getX(), p.getY() + side);
        Point[] points = new Point[]{p1, p2, p3, p4};
        return points;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

}
