package codewars;

public class FindEvenIndex {
    public static void main(String[] args) {


        System.out.println(findEvenIndex(new int[]{1, 2, 3, 4, 3, 2, 1}));
        System.out.println(findEvenIndex(new int[]{1, 100, 50, -51, 1, 1}));
        System.out.println(findEvenIndex(new int[]{1, 2, 3, 4, 5, 6}));
        System.out.println(findEvenIndex(new int[]{20, 10, 30, 10, 10, 15, 35}));
        System.out.println(findEvenIndex(new int[]{-8505, -5130, 1926, -9026}));
        System.out.println(findEvenIndex(new int[]{2824, 1774, -1490, -9084, -9696, 23094}));
        System.out.println(findEvenIndex(new int[]{4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));


    }


    public static int findEvenIndex(int[] arr) {


        boolean isEqual = false;

        int sumEnd = 0;
        int counter = -1;
        int elements = arr.length - 2;


        int sum = 0;

        for (int i : arr)
            sum += i;
        sum = sum - arr[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {

            sum = sum - arr[arr.length - (i + 2)];
            sumEnd = sumEnd + arr[arr.length - 1 - i];


            isEqual = sum == sumEnd;

            if (isEqual == true) {
                counter = elements - i;
                break;
            } else if (i + 2 == arr.length) {
                return -1;
            }


        }

        return counter;
    }

}
