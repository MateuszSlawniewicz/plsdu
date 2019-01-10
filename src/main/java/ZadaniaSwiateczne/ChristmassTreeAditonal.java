package ZadaniaSwiateczne;

public class ChristmassTreeAditonal {


    public static void main(String[] args) {


        christmassTree(10);


    }

    private static void christmassTree(int size) {

//        for (int i = 0; i < size; i++) {
//
//
//            for (int j = 0; j < size - i; j++) {
//                System.out.print(".");
//            }
//            for (int k = 0, l = i; k < (2 * i + 1); k++) {
//
//                if (k <= i) {
//                    System.out.print(k + 1);
//                } else {
//                    l--;
//                    System.out.print(l + 1);
//                }
//
//            }
//            for (int z = size + 1; z < (size * 2) + 1 - i; z++) {
//                System.out.print(".");
//            }
//
//
//            System.out.println();
//        }
//


        for (int i = 1; i < size; i++) {

            for (int j = 1; j < size - i; j++) {
                System.out.print("*");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int k = 1; k < i; k++) {
                System.out.print(i - k);
            }


            for (int j = 1; j < size - i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }


    }

}



