package org.Scaler.Beginner.Day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HW2_Print_Reverse {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long size = sc.nextInt();
		ArrayList<Integer> noOfElement = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			noOfElement.add(sc.nextInt());
		}
        Collections.reverse(noOfElement);
        for (Integer integer : noOfElement) {
			System.out.print(integer+" ");
		}


	}

}
