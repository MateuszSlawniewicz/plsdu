package homeworkOOP;

public class OopHomework1 {


//    Proponowane miejsce wywoływania metod to nowa klasa OopHomework1
//    Dodajcie klasę Point
//    wraz polami
//    double x
//    double y
//    oraz konstruktorem ze wszystkimi parametrami
//    Dodajcie klasę abstrakcyjną Figure
//    wraz z metodami:
//    abstract String toString()
//    abstract double getArea()
//    abstract double getCircuit()
//    abstract Point[] getEdges(); //może być Lista skoro już ją poznaliśmy:)
//    Dodajcie klasy Rozszerzające Figure
//-Rectangle
//-Circle
//-Square
//    Następnie zaimplementujcie zgodnie z matematyką metody zdeklarowane w Figure w następujących nowych klasach:
//    Klasa Rectangle powinna np zawierać pola:
//    Point p;
//    double width;
//    double height;
//    Klasa Circle powinna zawierać pola:
//    Point p;
//    double r;
//    Klasa Square powinna zawierać pola:
//    Point p;
//    double side;
//    W metodzie main utwórzcie kilka obiektów i wypiszcie kolejno ich właściwości.
//    Możecie również zaimplementować metodę toString() aby wyświetlała te właściwości.


    public static void main(String[] args) {

        Point point = new Point(1, 2);

        Circle circle = new Circle(point, 2);
        System.out.println(circle.getArea());

    }
}
