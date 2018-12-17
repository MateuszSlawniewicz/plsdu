package ZadaniaGrupowe;

public class MathTree {

    public static void main(String[] args) {


        christmasTree(4);

    }

    private static void christmasTree(int hight) {




        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < hight - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print(i + 1);
            }


            System.out.println();
        }

    }
}
