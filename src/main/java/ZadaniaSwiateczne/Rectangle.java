package ZadaniaSwiateczne;

public class Rectangle {

    public static void main(String[] args) {
        drawRectangle(8, 10);

    }

    private static void drawRectangle(int a, int b) {

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("X");
            }
            System.out.println();
        }

        for (int i = 1; i < b - 1; i++) {
            for (int j = 1; j < 2; j++) {
                System.out.print("X");
            }
            for (int j = 2; j < a; j++) {
                System.out.print(" ");
            }
            for (int j = a; j <= a; j++) {
                System.out.print("X");
            }


            System.out.println();
        }

        for (int i = b - 1; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("X");
            }
            System.out.println();
        }


    }

}
