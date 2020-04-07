package deleteMultipleOccurrences;

import static org.junit.Assert.*;

import org.junit.Test;

public class EnoughIsEnoughTest {

	@Test
	public void deleteNth_singleElementArray_returnOriginalArray() {
		assertArrayEquals(new int [] {1}, EnoughIsEnough.deleteNth(new int [] {1}, 1));
	}
	
	@Test
	public void deleteNth_differentSingleElementArray_returnOriginalArray() {
		assertArrayEquals(new int [] {2}, EnoughIsEnough.deleteNth(new int [] {2}, 1));
	}

}
