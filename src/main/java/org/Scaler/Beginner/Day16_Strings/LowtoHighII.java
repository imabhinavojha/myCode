package org.Scaler.Beginner.Day16_Strings;
import java.util.Scanner;

public class LowtoHighII {

	public static void main(String[] args) {
		LowtoHighII LTH = new LowtoHighII();
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		System.out.println(LTH.solve(A));

	}

	public String solve(String A) {
		A = A.toUpperCase();
		return A;
	}
}
