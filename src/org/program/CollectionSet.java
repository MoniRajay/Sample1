package org.program;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {
	
	public static void main(String[] args) {
		
		Set a = new HashSet();
		Set b = new LinkedHashSet();
		Set c = new TreeSet();
		Set d = new HashSet();
	
		d.add(25);
		d.add(20);
		d.add(10);
		System.out.println(d);

		a.add(20);
		a.add(60);
		a.add(1);     
		System.out.println(a);
		
		
		b.add(5);
		b.add(20);
		b.add(2);
		System.out.println(b);
		
		c.add(95);
		c.add("text");
		c.add("10"); 
		
		
		
		System.out.println(c);
		
		
		
		
		
		
		
		
	}

}
