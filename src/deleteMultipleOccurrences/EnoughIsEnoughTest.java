package deleteMultipleOccurrences;

import static org.junit.Assert.*;

import org.junit.Test;

public class EnoughIsEnoughTest {

	@Test
	public void deleteNth_singleElementArray_returnOriginalArray() {
		assertArrayEquals(new int [] {1}, EnoughIsEnough.deleteNth(new int [] {1}, 1));
		assertArrayEquals(new int [] {2}, EnoughIsEnough.deleteNth(new int [] {2}, 1));
	}
	
	@Test
	public void deleteNth_maxOccurrencesOf1_returnCorrectArray() {
		assertArrayEquals(new int [] {1}, EnoughIsEnough.deleteNth(new int [] {1,1}, 1));
		assertArrayEquals(new int [] {2}, EnoughIsEnough.deleteNth(new int [] {2,2}, 1));
	}
	
	@Test
	public void deleteNth_maxOccurrencesOf2_returnCorrectArray() {
		assertArrayEquals(new int [] {1,1}, EnoughIsEnough.deleteNth(new int [] {1,1,1}, 2));
		assertArrayEquals(new int [] {1,2,1}, EnoughIsEnough.deleteNth(new int [] {1,2,1}, 2));
	}
	
	@Test
	public void deleteNth_maxOccurrencesOf3_returnCorrectArray() {
		assertArrayEquals(new int [] {1,1,1}, EnoughIsEnough.deleteNth(new int [] {1,1,1,1}, 3));
		assertArrayEquals(new int [] {1,2,1,2,1,2}, EnoughIsEnough.deleteNth(new int [] {1,2,1,2,1,2,1,1,2,2}, 3));
	}
	
	@Test
	public void deleteNth_maxOccurrencesOf4_returnCorrectArray() {
		assertArrayEquals(new int [] {1,3,2,3,3,3,4,5,1,1,1,4,4,4}, EnoughIsEnough.deleteNth(new int [] {1,3,2,3,3,3,3,4,5,1,3,3,1,1,4,1,1,3,4,4,1,3}, 4));
		assertArrayEquals(new int [] {1,1,1,1}, EnoughIsEnough.deleteNth(new int [] {1,1,1,1,1,1}, 4));
	}
	
}
