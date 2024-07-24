package org.Scaler.Intermediate.Day34;

public class power_Without_function {
	public static void main(String[] args) {
		int base = 2, n = 5, p = 7;
		int answer = 1;

		while (n != 0) {
			answer = answer * base;
			n--;
		}
		System.out.println(answer % p);

	}

}
