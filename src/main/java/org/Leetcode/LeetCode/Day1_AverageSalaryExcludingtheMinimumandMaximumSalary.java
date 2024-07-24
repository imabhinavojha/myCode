package org.Leetcode.LeetCode;

public class Day1_AverageSalaryExcludingtheMinimumandMaximumSalary {

	public static void main(String[] args) {
		int[] sal = { 4000,3000,1000,2000 };
		Day1_AverageSalaryExcludingtheMinimumandMaximumSalary as = new Day1_AverageSalaryExcludingtheMinimumandMaximumSalary();
		System.out.println(as.average1(sal));

	}

	public double average(int[] salary) {
		// Arrays.sort(arr);

		int index = -1;

		for (int i = 0; i < salary.length; i++) {
			index = i;
			for (int j = i; j <= salary.length - 1; j++) {
				if (salary[j] < salary[index]) {
					index = j;
				}
			}
			int temp = salary[i];
			salary[i] = salary[index];
			salary[index] = temp;
		}

		double min = salary[0];
		double max = salary[salary.length - 1];
		double sum = 0;
		double avg = 0;

		for (int i = 1; i < salary.length - 1; i++) {
			sum = sum + salary[i];
		}
		avg = sum / (salary.length - 2);
		return avg;

	}

	public double average1(int[] salary) {
		// Arrays.sort(arr);

		int i;
		int max = salary[0];
		int min = salary[0];

		for (i = 1; i < salary.length; i++)
			if (salary[i] > max)
				max = salary[i];


		for (i = 1; i < salary.length; i++)
			if (salary[i] < min)
				min = salary[i];

		
		

		double sum = 0;
		double avg = 0;
		for (int j = 0; j < salary.length; j++) {
			sum = sum + salary[j];
		}
		
		avg = ( (sum-(min+max)) / (salary.length - 2));
		return avg;

	}
}
