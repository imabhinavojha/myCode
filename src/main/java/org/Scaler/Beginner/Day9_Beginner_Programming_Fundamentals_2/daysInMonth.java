package org.Scaler.Beginner.Day9_Beginner_Programming_Fundamentals_2;

import java.util.Scanner;

public class daysInMonth {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number_Of_DaysInMonth = 0;
		String MonthOfName = "Unknown";

		int month = input.nextInt();

		switch (month) {
		case 1:
			MonthOfName = "January";
			number_Of_DaysInMonth = 31;
			break;
		case 2:
			MonthOfName = "February";

			number_Of_DaysInMonth = 28;
			break;
		case 3:
			MonthOfName = "March";
			number_Of_DaysInMonth = 31;
			break;
		case 4:
			MonthOfName = "April";
			number_Of_DaysInMonth = 30;
			break;
		case 5:
			MonthOfName = "May";
			number_Of_DaysInMonth = 31;
			break;
		case 6:
			MonthOfName = "June";
			number_Of_DaysInMonth = 30;
			break;
		case 7:
			MonthOfName = "July";
			number_Of_DaysInMonth = 31;
			break;
		case 8:
			MonthOfName = "August";
			number_Of_DaysInMonth = 31;
			break;
		case 9:
			MonthOfName = "September";
			number_Of_DaysInMonth = 30;
			break;
		case 10:
			MonthOfName = "October";
			number_Of_DaysInMonth = 31;
			break;
		case 11:
			MonthOfName = "November";
			number_Of_DaysInMonth = 30;
			break;
		case 12:
			MonthOfName = "December";
			number_Of_DaysInMonth = 31;
		}
		System.out.print(number_Of_DaysInMonth);
	}
}
