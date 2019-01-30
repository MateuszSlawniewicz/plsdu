package SortExample;

import java.util.Arrays;

public class ExampleOfQuickSort {

    public static void main(String[] args) {
        int[] tab = {5, 8, 6, 4, 3};

        ExampleOfQuickSort.qsort(tab, 0, 4);
        System.out.println(Arrays.toString(tab));
    }


    public static void qsort(int[] a, int left, int right) {
        //base case
        if (right <= left || a == null) {
        } else {
            int pivot = a[left];
            int border = left + 1;
            int tmp;

            //partition array

            for (int j = left + 1; j <= right; j++) {
                if (pivot > a[j]) {
                    tmp = a[j];
                    a[j] = a[border];
                    a[border] = tmp;

                    border++;
                }
            }

            //put pivot in right position
            a[left] = a[border - 1];
            a[border - 1] = pivot;

            //call qsort on right and left sides of pivot
            qsort(a, left, border - 2);
            qsort(a, border, right);
        }
    }


}