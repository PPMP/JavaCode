package oop.dataanalyzer.q3;

import java.util.LinkedList;

//class to compute max, min, and avg
public class DataAnalyzer {

	private LinkedList<Integer> numList;

	// create a LinkedList of Integers named numList
	public DataAnalyzer(LinkedList<Integer> numList) {
		this.numList = numList;
	}

	/**
	 * Computes the min of user inputs
	 * 
	 * @return the min of user inputs
	 */
	public int min() {
		int min = numList.get(0);
		for (int i = 0; i < numList.size(); i++) {
			if (min < numList.get(i) || min == numList.get(i)) {
				continue;
			} else {
				min = numList.get(i);
			}
		}
		return min;
	}

	/**
	 * Computes the max of user inputs
	 * 
	 * @return the max of user inputs
	 */
	public int max() {
		int max = numList.get(0);
		for (int i = 0; i < numList.size(); i++) {
			if (max > numList.get(i) || max == numList.get(i)) {
				continue;
			} else {
				max = numList.get(i);
			}
		}
		return max;
	}

	/**
	 * Computes the avg of user inputs
	 * 
	 * @return the avg of user inputs
	 */
	public int avg() {
		int sum = 0;
		for (int i = 0; i < numList.size(); i++) {
			sum += numList.get(i);
		}
		return sum / numList.size();
	}
}
