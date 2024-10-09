package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class sample {

	public static void main(String[] args) {
		Set s = new TreeSet<>();
		s.add(10);
		s.add(1);
		s.add(30);
		s.add(90);
		s.add(70);
		System.out.println(s.contains(30));
		System.out.println(s.equals(10));
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		System.out.println(s.remove(30));
		System.out.println(s);
		for (Object a : s)
			System.out.println(a);
		
	}

}
