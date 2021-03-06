# Delete occurrences of an element if it occurs more than n times (6 KYU)

Solving [this](https://www.codewars.com/kata/554ca54ffa7d91b236000023/java) codewars challenge.

## Description 

Enough is enough!
Alice and Bob were on a holiday. Both of them took many pictures of the places they've been, and now they want to show Charlie their entire collection. However, Charlie doesn't like this sessions, since the motive usually repeats. He isn't fond of seeing the Eiffel tower 40 times. He tells them that he will only sit during the session if they show the same motive at most N times. Luckily, Alice and Bob are able to encode the motive as a number. Can you help them to remove numbers such that their list contains each number only up to N times, without changing the order?

Task
Given a list lst and a number N, create a new list that contains each number of lst at most N times without reordering. For example if N = 2, and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].

## Examples

```
EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1) // return [20,37,21]
EnoughIsEnough.deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3) // return [1, 1, 3, 3, 7, 2, 2, 2]
```

## Tests

Using JUnit 4 in eclipse to for tests.

```
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
		@Test
	public void deleteNth_acceptanceCriteriaExample_returnCorrectArray() {
		assertArrayEquals(new int [] {1,1,3,3,7,2,2,2}, EnoughIsEnough.deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3));
		assertArrayEquals(new int [] {20,37,21}, EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1));
	}
```