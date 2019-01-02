package Logic_Programs;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;

public class getRepCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Software Engineering";
		char c[] = s.toLowerCase().toCharArray();

		Map<Character, Integer> m = new HashMap<Character, Integer>();

		for (char ch : c) {
			if (!m.containsKey(ch)) {
				m.put(ch, 1);
			} else {
				m.put(ch, m.get(ch) + 1);
			}
		}
		System.out.println(m);

		List<Map.Entry<Character, Integer>> li = new LinkedList<Map.Entry<Character, Integer>>(m.entrySet());

		ListIterator<Entry<Character, Integer>> it = li.listIterator();

		Collections.sort(li, (l1, l2) -> l2.getValue().compareTo(l1.getValue()));

		LinkedHashMap<Character, Integer> li_hash = new LinkedHashMap<Character, Integer>();

		for (Map.Entry<Character, Integer> li_map : li) {

			li_hash.put(li_map.getKey(), li_map.getValue());
		}

		System.out.println(li_hash);

		while (it.hasNext()) {

			System.out.println("Max Repeated Key : " + it.next());
			break;
		}
		// System.out.println("Max Repeated Key's value :
		// "+li_hash.get(li_hash.keySet().toArray()[0]));
	}
}
