package academy.learnprogramming.sortalgorithms;

import java.util.Arrays;

public class SortingUsingJDK {
    
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        
        /**
         * Sorts the specified array into ascending numerical order.
         *
         * <p>Implementation note: The sorting algorithm is a Dual-Pivot Quicksort
         * by Vladimir Yaroslavskiy, Jon Bentley, and Joshua Bloch. This algorithm
         * offers O(n log(n)) performance on many data sets that cause other
         * quicksorts to degrade to quadratic performance, and is typically
         * faster than traditional (one-pivot) Quicksort implementations.
         *
         * @param a the array to be sorted
         */
        Arrays.sort(intArray);

        /**
         * Sorts the specified array into ascending numerical order.
         *
         * @implNote The sorting algorithm is a parallel sort-merge that breaks the
         * array into sub-arrays that are themselves sorted and then merged. When
         * the sub-array length reaches a minimum granularity, the sub-array is
         * sorted using the appropriate {@link Arrays#sort(int[]) Arrays.sort}
         * method. If the length of the specified array is less than the minimum
         * granularity, then it is sorted using the appropriate {@link
         * Arrays#sort(int[]) Arrays.sort} method. The algorithm requires a
         * working space no greater than the size of the original array. The
         * {@link ForkJoinPool#commonPool() ForkJoin common pool} is used to
         * execute any parallel tasks.
         *
         * @param a the array to be sorted
         *
         * @since 1.8
         */
        Arrays.parallelSort(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

}
