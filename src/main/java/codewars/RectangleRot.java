package codewars;

public class RectangleRot {
    public static void main(String[] args) {
        System.out.println(rectangleRotation(6, 4));

    }


    static int rectangleRotation(final int a, final int b) {
        int real_a = (int) (a / Math.sqrt(2));
        int real_b = (int) (b / Math.sqrt(2));

        return (real_a * (1 + real_b * 2) + real_b + ((real_a % 2 == real_b % 2) ? (1) : (0)));
    }

}



