package deleteMultipleOccurrences;

import java.util.HashMap;
import java.util.LinkedList;

public class EnoughIsEnough {
	
	static int[] deleteNth(int[] elements, int maxOccurrences) {
		if(maxOccurrences == 0) {
			return new int[0];
		}
		HashMap<Integer, Integer> elementCount = new HashMap<Integer, Integer>();
		LinkedList<Integer> fifoElements = new LinkedList<Integer>();
		for(int i = 0; i < elements.length; i++) {
			if(elementCount.containsKey((int)elements[i])) {
				if(elementCount.get(elements[i]) < maxOccurrences) {
					elementCount.put(elements[i], elementCount.get(elements[i])+1);
					fifoElements.add(elements[i]);				}
			} else {
				if(!elementCount.containsKey(elements[i])) {
					elementCount.put(elements[i], 1);
					fifoElements.add(elements[i]);
				}
			}
		}
		int[] answer = new int[fifoElements.size()];
		int index = 0;
		while(!fifoElements.isEmpty()) {
			answer[index] = fifoElements.removeFirst();
			index++;
		}
		return answer;

	}
	
}
