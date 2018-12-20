package ZadaniaSwiateczne;

public class FibonacciSequence {
    public static void main(String[] args) {

        fibonacciSequenceWithWhile(0);

    }


    private static void fibonacciSequenceWithWhile(int numberOfLastElement) {


        System.out.print(0);

        int j = 0;
        int i = 1;
        int k;
        int l = 0;

        while (l < numberOfLastElement) {


            k = i + j;
            System.out.print("\t" + k);
            i = j;
            j = k;
            l++;


        }


    }
}
