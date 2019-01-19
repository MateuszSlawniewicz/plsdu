package homeworkOOP;

public class Rectangle extends Figure {
    private Point p;
    private double width;
    private double height;


    public Rectangle(Point p, double width, double height) {
        this.p = p;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getCircuit() {
        return 2 * width + 2 * height;
    }

    @Override
    Point[] getEdges() {
        Point p1 = p;
        Point p2 = new Point(p.getX() + width, p.getY());
        Point p3 = new Point(p.getX() + width, p.getY() + height);
        Point p4 = new Point(p.getX(), p.getY() + height);
        Point[] points = new Point[]{p1, p2, p3, p4};
        return points;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
