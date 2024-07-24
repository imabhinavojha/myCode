package org.Scaler.Beginner.Day16_Strings;
import java.util.Scanner;

public class TrimFromEnds {

	public static void main(String[] args) {
		TrimFromEnds tfe = new TrimFromEnds();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(tfe.solve(str));

	}

	public String solve(String A) {
		StringBuilder sb = new StringBuilder(A);
		while (sb.length() > 0 && sb.charAt(0) == '*') {
			sb.deleteCharAt(0);
		}
		String B = sb.toString();
		StringBuilder sb1 = new StringBuilder(B);

		while (sb1.length() > 0 && sb1.charAt(sb1.length() - 1) == '*') {
			sb1.setLength(sb1.length() - 1);

		}
		return sb1.toString();
	}
}
