package academy.learnprogramming.sortalgorithms;

/**
 * 
 *  - Stored as contiguous block in memory
    - Every element occupies the same amount of space in memory.
    - If and array starts at memory address x, and the size of each element in the array is y, we can calculate the memory address of the ith element by using the expression : x + i * y
    - If we know the index of an element, the time to retrieve the element will be the same, no matter where it is in the array.
    - Retrieving an element in the array will have constant time complexity O(1) if the index is know.
    
    Operation						Time Complexity
    Retrieve with index 				 O(1) - Constant time
    Retrieve without index				 O(n) - Linear time
    Add and element to a full array			 O(n)
    Add an element to the end of an array(has space)     O(1)
    Insert or update an element at a specific index      O(1)
    Delete an element by setting it to null		 O(1)
    Delete and element by shifting elements		 O(n)

 *
 */
public class Arrays {

    public static void main(String[] args) {
	int[] intArray = new int[7];

	intArray[0] = 20;
	intArray[1] = 35;
	intArray[2] = -15;
	intArray[3] = 7;
	intArray[4] = 55;
	intArray[5] = 1;
	intArray[6] = -22;

	int index = -1;
	//If we don't know the index the worst case time complexity will be Linear O(n)
	for (int i = 0; i < intArray.length; i++) {
	    if (intArray[i] == 7) {
		index = i;
		break;
	    }
	}

	System.out.println("index = " + index);

    }
}