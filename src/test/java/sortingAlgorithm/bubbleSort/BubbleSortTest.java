package sortingAlgorithm.bubbleSort;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BubbleSortTest {

	int[] numbers = { 4, 7, 1, 6, 3, 5, 4 };
	int[] afterSorting = { 1, 3, 4, 4, 5, 6, 7 };
	public static List<Integer> numbersList = Arrays.asList(4, 7, 1, 6, 3, 5, 4);
	public static List<Integer> sortingList = Arrays.asList(1, 3, 4, 4, 5, 6, 7);

	@Test
	public void bubbleSortTest() {
		BubbleSort.bubbleSort(numbers);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		assertArrayEquals(afterSorting, numbers);
	}
}
