package org.Scaler.Beginner.Day14_Arrays;

public class VolumeOfSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(VolumeOfSphere.solve(282));
	}
	static int solve(final int A) {
		double acos  = -1;
		float vos = (float) ((Math.acos(acos) * 4 * A * A * A)/3);
		int s = (int) Math.ceil(vos);
		return s;
    }


}
