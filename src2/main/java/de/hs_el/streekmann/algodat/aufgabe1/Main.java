


package de.hs_el.streekmann.algodat.aufgabe1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		int numberOfElements = 10;
		if (args.length > 0) {
			numberOfElements = Integer.parseInt(args[0]);
		}

		List<Integer> linkedList = new LinkedList<>();
		fillList(linkedList, numberOfElements);
		System.out.println("--- LinkedList printed in for loop  ---");
		printListInForLoop(linkedList);

		System.out.println("--- LinkedList printed in for loop with iterator ---");
		printListInForLoopWithIterator(linkedList);

		System.out.println("--- LinkedList printed in foreach loop ---");
		printListInForeachLoop(linkedList);


		List<Integer> arrayList = new ArrayList<>();
		fillList(arrayList, numberOfElements);
		System.out.println("--- ArrayList printed in for loop  ---");
		printListInForLoop(arrayList);

		System.out.println("--- ArrayList printed in for loop with iterator ---");
		printListInForLoopWithIterator(arrayList);

		System.out.println("--- ArrayList printed in foreach loop ---");
		printListInForeachLoop(arrayList);
		System.out.println("Welche Konsequenzen ziehen Sie aus den Messungen für die Verwendung von Iteratoren?"+"\n"+"Bei der LinkedList der Iterator ist effizienter als die get(), da nicht soviele Sprünge gemacht werden müssen."
		+"\n"+ "Bei der ArrayList macht es keinen Unterschied, ob get() oder Iterator.");
	}

	private static <E> void printListInForLoopWithIterator(List<E> list) {
		for (Iterator<E> iterator = list.iterator(); iterator.hasNext();) {
			System.out.print(iterator.next() + "  ");
			System.out.println("Sprüge bis zu diesem Element: "+list.getNextCountEinzelt() + "   Gesamte Sprünge : " + list.getNextCountGesamt());
	
		}
		System.out.println("\n");
	}

	private static <E> void printListInForeachLoop(List<E> list) {
		for (E element : list) {
			System.out.print(element + "  ");
		}
		System.out.println("\n");
	}

	private static <E> void printListInForLoop(List<E> list) {
		//System.out.println(list.get(0));
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "  ");
			System.out.println("Sprüge bis zu diesem Element: "+list.getCounteinzelt() + "   Gesamte Sprünge : " + list.getCountgesamt());
		}
		//System.out.println(list.size());
		System.out.println("\n");
	}

	private static void fillList(List<Integer> list, int numberOfElements) {
		
		for (int i = 1; i <= numberOfElements; i++) {
			list.add(i * i);
		}
	}
}
