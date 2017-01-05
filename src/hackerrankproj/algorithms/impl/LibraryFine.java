package hackerrankproj.algorithms.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LibraryFine {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter actual return date");
		String actual = sc.next();
		System.out.println("Enter expected return date");
		String expected = sc.next();*/
		Date actualDate = convertToDate("9 6 2015");
		System.out.println(actualDate);
		Date expectedDate = convertToDate("6 6 2015");
		System.out.println(expectedDate);
		System.out.println(calculateFine(actualDate, expectedDate));
	}

	public static Date convertToDate(String dateString) {
		SimpleDateFormat ft = new SimpleDateFormat ("d M yyyy");
		Date date = null;
		try {
			date = ft.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	
	public static double calculateFine(Date actual, Date expected) {
		if(actual.getYear() != expected.getYear()) {
			return 10000;
		}
		if(actual.getMonth() != expected.getMonth()) {
			return 500 * (actual.getMonth() - expected.getMonth());
		}
		if(actual.getDate() != expected.getDate()) {
			return 15 * (actual.getDate() - expected.getDate());
		}
		return 0;
		
	}
}
