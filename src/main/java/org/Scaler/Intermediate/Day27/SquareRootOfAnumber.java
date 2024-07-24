package org.Scaler.Intermediate.Day27;

public class SquareRootOfAnumber {

	public int solve(int A) {
		int squre=0;
		if (Math.ceil((double) Math.sqrt(A)) == Math.floor((double) Math.sqrt(A))) {
			squre= (int) Math.ceil((double) Math.sqrt(A));
		} else {
			squre = -1;
		}
		return squre;
	}

	public static void main(String[] args) {
		SquareRootOfAnumber sra = new SquareRootOfAnumber();
		int n = 49;
		System.out.println(sra.solve(n));
	}

}
