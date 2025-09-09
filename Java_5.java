package amdocs_collections;

import java.util.Iterator;
import java.util.LinkedList;

public class List_Assignment {
	public static void main(String args[]) {
		LinkedList<String> months = new LinkedList<String>();
		
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("April");
		months.add("November");
		
		
		months.addFirst("January");
		months.addLast("December");
		
		months.add(1,"February");
		months.add(2,"March");
		
		months.add(8,"September");
		months.add(9,"October");
		
		months.remove("April");
		months.add(3,"April");
		
		// 1st
		System.out.println("Months : "+ months);
		
		//2nd
		System.out.print("\nEven Months : ");
		for(int i=0;i<12;i+=2) {
			System.out.print(months.get(i)+ " ");
		}
		
		//3rd
		System.out.print("\nOdd Months : ");
		for(int i=1;i<12;i+=2) {
			System.out.print(months.get(i)+ " ");
		}
		
		//4th
		System.out.print("\nUsing Iterator : ");
		Iterator it = months.iterator();
		while (it.hasNext()){
			System.out.print(it.next()+ " ");
		}
		
		//5th
		System.out.println("\nFirst Month : "+months.peekFirst() + " & Last Month : "+months.peekLast());
		
		//6th
		months.remove("February");
		System.out.println("Months : "+months);
		
		//7th
		if(months.contains("December") || months.contains("January")) {
			System.out.println("Winter Month is present");
		}
		else {
			System.out.println("No Winter Month present");
		}
		
		//8th
		System.out.println("First Month : "+months.peekFirst() + " & Last Month : "+months.peekLast());
		
		//9th
		System.out.println("First Month : "+months.pollFirst() + " & Last Month : "+months.pollLast());
		
		System.out.println("Months : "+months);
	}
	
}
