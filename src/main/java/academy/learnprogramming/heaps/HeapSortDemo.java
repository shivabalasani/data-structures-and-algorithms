package academy.learnprogramming.heaps;

public class HeapSortDemo {

    public static void main(String[] args) {
	HeapSort heap = new HeapSort(10);

	heap.insert(80);
	heap.insert(75);
	heap.insert(60);
	heap.insert(68);
	heap.insert(55);
	heap.insert(40);
	heap.insert(52);
	heap.insert(67);

	heap.printHeap();

	// System.out.println(heap.peek());

	heap.delete(0);
	heap.printHeap();

	// System.out.println(heap.peek());

	heap.sort();
	heap.printHeap();
    }
}
