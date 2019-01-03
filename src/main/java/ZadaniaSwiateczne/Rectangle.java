package ZadaniaSwiateczne;

public class Rectangle {

    public static void main(String[] args) {
        drawRectangle(8, 10);

    }

    private static void drawRectangle(int length, int higth) {

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("X");
            }
            System.out.println();
        }

        for (int i = 1; i < higth - 1; i++) {
            for (int j = 1; j < 2; j++) {
                System.out.print("X");
            }
            for (int j = 2; j < length; j++) {
                System.out.print(" ");
            }
            for (int j = length; j <= length; j++) {
                System.out.print("X");
            }


            System.out.println();
        }

        for (int i = higth - 1; i < higth; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("X");
            }
            System.out.println();
        }


    }

}
