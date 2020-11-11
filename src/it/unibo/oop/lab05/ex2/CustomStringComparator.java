package it.unibo.oop.lab05.ex2;

import java.util.Comparator;


/**
 * Comparator of strings with hashCode
 * @author Marco
 *
 */
public class CustomStringComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return Integer.compare(o1.hashCode(), o2.hashCode());
	}

}
