package ch03;

import java.util.*;

public class TestCollectionsForList {

	public static void main(String args[]) {
		List list = new ArrayList();
		list.add("5");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("1");

		Collections.sort(list);
//		Collections.reverse(list);

		Object obj;
		for (int i = 0; i < list.size(); i++) {
			obj = list.get(i);
			System.out.println(obj);
		}
	}
}
