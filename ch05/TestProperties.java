package ch05;

import java.util.*;

public class TestProperties {
	public static void main(String args[]) {
//		System.setProperty("MyProperty", "吳冠宏");  //測試用

		Properties props = System.getProperties();
		Enumeration names = props.propertyNames();

		while (names.hasMoreElements()) {
			String name = (String) names.nextElement();
			String val = props.getProperty(name);
			System.out.println("property of " + name + " = " + val);
		}
	}
}
