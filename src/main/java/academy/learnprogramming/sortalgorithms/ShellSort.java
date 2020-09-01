package academy.learnprogramming.sortalgorithms;

/**
 * 
 *  - In-place algorithm
 *  - Difficult to nail down the time complexity because it will depend on the gap.
 *  - Worst case: O(n^2), but it can perform much better than that.
 *  - Doesn't require as much shifting as insertion sort, so it usually performs better.
 *  - Unstable algorithm.
 *  
 *  - Variation of Insertion Sort
 *  - Insertion sort chooses which element to insert using a gap of 1
 *  - Shell Sort starts out using a larger gap value
 *  - As the algorithm runs, the gap is reduced
 *  - Goal is to reduce the amount of shifting required
 *  - The last gap value is always 1. Gap value of 1 is equal to insertion sort.
 *  - By the time we get to the insertion sort, the array has been partially sorted, so there's less shifting required.
 *  
 *  - Knuth Sequence - One way to calculate gap value.
 *  - Gap is calculated using (3^k -1)/2 - 3 to the power k. [1, 4, 13, 40, 121.. and so on] for k [1,2,3,4,5...]
 *  - We set k based on the length of the array.
 *  - We want the gap to be as close as possible to the length of the array we want to sort, without being greater than the length
 *    
 *  
 *
 */

public class ShellSort {

    public static void main(String[] args) {

	int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

	for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

	    for (int i = gap; i < intArray.length; i++) {
		int newElement = intArray[i];

		int j = i;

		while (j >= gap && intArray[j - gap] > newElement) {
		    intArray[j] = intArray[j - gap];
		    j -= gap;
		}

		intArray[j] = newElement;
	    }
	}

	for (int i = 0; i < intArray.length; i++) {
	    System.out.println(intArray[i]);
	}
    }

}

