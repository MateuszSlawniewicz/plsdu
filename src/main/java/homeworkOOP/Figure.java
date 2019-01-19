package homeworkOOP;

public abstract class Figure {
    @Override
    public abstract String toString();

    abstract double getArea();

    abstract double getCircuit();

    abstract Point[] getEdges();
}
