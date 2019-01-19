package ZadaniaGrupowe;

public class LetteraA {

    public static void main(String[] args) {
drawA(6);
    }
    private static void drawA(int  hight){

        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < hight - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("A");
            }


            System.out.println();
        }


    }
}
