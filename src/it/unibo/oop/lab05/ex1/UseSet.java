package it.unibo.oop.lab05.ex1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {
	
	private static final int ELEMS = 20;

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    	
    	TreeSet<String> treeSet = new TreeSet<String>();
    	for (int i = 1; i <= ELEMS; i++) {
            treeSet.add(Integer.toString(i));
        }
    	
    	
    	System.out.println(treeSet.toString());
    	
    	Iterator<String> stringIterator = treeSet.iterator();    	
    	
    	while (stringIterator.hasNext()) {
    		String element = stringIterator.next();
    		if (Integer.parseInt(element) % 3 == 0) {
    			stringIterator.remove();
    		}
    	}
    	
    	for (String element : treeSet) {
    		System.out.println(element.toString());
    	}
    	
    	for (String element : treeSet) {
    		if (Integer.parseInt(element) % 2 != 0) {
    			System.out.println("This element is not even, bug");
    			return;
    		}
    	}
    	
    }
}
