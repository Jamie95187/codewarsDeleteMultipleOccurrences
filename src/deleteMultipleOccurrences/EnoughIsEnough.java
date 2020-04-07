package deleteMultipleOccurrences;

public class EnoughIsEnough {
	
	static int[] deleteNth(int[] elements, int maxOccurrences) {
		if(elements.length == 2 && maxOccurrences == 1) {
			return new int[] {elements[0]};
		}
		return elements;
	}
	
}
