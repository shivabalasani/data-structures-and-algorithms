package academy.learnprogramming.sortalgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * - Uses hashing - Makes assumptions about the data, like radix and counting
 * sort. - Because it makes assumptions, can sort in O(n) time. - Performs best
 * when hashed values of items being sorted are evenly distributed, so there
 * aren't many collisions.
 * 
 * - Distribute the items into bucket based on their hashed values (scaterring
 * phase) - Sort the items in each bucket. - Merge the buckets - can just
 * concatenate them (gathering phase)
 * 
 * - Not in-place - Stability will depend on sort algorithm used to sort the
 * buckets - ideally you want a stable sort. - To achieve O(n), must have only
 * one item per bucket - Insertion sort is often used to sort the buckets,
 * because it is fast when the number of items is small
 * 
 */
public class BucketSort {

    public static void main(String[] args) {
	int[] intArray = { 54, 46, 83, 66, 95, 92, 43 };

	bucketSort(intArray);

	for (int i = 0; i < intArray.length; i++) {
	    System.out.println(intArray[i]);
	}
    }

    public static void bucketSort(int[] input) {
	List<Integer>[] buckets = new List[10];

	for (int i = 0; i < buckets.length; i++) {
	    // using linked lists for the buckets
	    // buckets[i] = new LinkedList<Integer>();

	    // using arraylists as the buckets
	    buckets[i] = new ArrayList<Integer>();
	}

	for (int i = 0; i < input.length; i++) {
	    buckets[hash(input[i])].add(input[i]);
	}

	for (List bucket : buckets) {
	    Collections.sort(bucket); //MergeSort
	}

	int j = 0;
	for (int i = 0; i < buckets.length; i++) {
	    for (int value : buckets[i]) {
		input[j++] = value;
	    }
	}
    }

    private static int hash(int value) {
	return value / 10;
    }

}
