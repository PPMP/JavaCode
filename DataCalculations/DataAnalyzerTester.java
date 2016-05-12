package oop.dataanalyzer.q3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

//class to read user input to calculate min, max, and avg
public class DataAnalyzerTester {

	public static void main(String[] args) {

		LinkedList<Integer> myList = new LinkedList<Integer>();
		String numbers;
		String fileName;
		
		//get user input for filename
		Scanner addfileName = new Scanner(System.in);
		System.out.print("Enter file name (i.e filename.txt): ");
		fileName = addfileName.next();
		
		//sb is to append each user input to the file
		//finalResult is to append max, min, and avg 
		StringBuilder sb = new StringBuilder();
		StringBuilder finalResult = new StringBuilder();
		
		//gets user input on numbers
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Text: ");
		while (scan.hasNext()) {
			System.out.println("Enter Text: ");
			String text = scan.nextLine();
			sb.append(text + " ");
			numbers = text;
			myList.add(Integer.parseInt(numbers));
		}
		
		//try catch includes writing the user inputs and
		//results of max, min, avg to file
		//catches an IO exception if there is one
		FileWriter fWriter = null;
		BufferedWriter writer = null;
		try {
			fWriter = new FileWriter(fileName);
			writer = new BufferedWriter(fWriter);
			writer.write(sb.toString());
			DataAnalyzer mylistTest = new DataAnalyzer(myList);
			System.out.println("avg = " + mylistTest.avg());
			System.out.println("min = " + mylistTest.min());
			System.out.println("max = " + mylistTest.max());
			finalResult.append("avg = " + mylistTest.avg() + " min = "
					+ mylistTest.min() + " max = " + mylistTest.max());
			writer.newLine();
			writer.write(finalResult.toString());
		} catch (IOException e) {
			System.out.println("IOException!");
		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
