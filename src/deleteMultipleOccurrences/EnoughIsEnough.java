package deleteMultipleOccurrences;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EnoughIsEnough {
	
	static int[] deleteNth(int[] elements, int maxOccurrences) {
		HashMap<Integer, Integer> elementCount = new HashMap<Integer, Integer>();
		LinkedList<Integer> fifoElements = new LinkedList<Integer>();
		for(int i = 0; i < elements.length; i++) {
			if(elementCount.containsKey((int)elements[i])) {
				if(elementCount.get(elements[i]) < maxOccurrences) {
					elementCount.put(elements[i], elementCount.get(elements[i])+1);
					fifoElements.add(elements[i]);
//					System.out.println("HENLO");
				}
			} else {
				if(!elementCount.containsKey(elements[i])) {
					elementCount.put(elements[i], 1);
					fifoElements.add(elements[i]);
				}
			}
		}
//		for(Map.Entry<Integer, Integer> me : elementCount.entrySet()) {
//			System.out.println("Key: " + me.getKey());
//			System.out.println("Value: " + me.getValue());
//		}
		int[] answer = new int[fifoElements.size()];
		int index = 0;
		while(!fifoElements.isEmpty()) {
			answer[index] = fifoElements.removeFirst();
			index++;
		}
		return answer;

	}
	
}
