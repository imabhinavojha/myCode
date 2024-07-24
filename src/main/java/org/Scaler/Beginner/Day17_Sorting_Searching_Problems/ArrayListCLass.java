package org.Scaler.Beginner.Day17_Sorting_Searching_Problems;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCLass {
	public static void main(String[] args) {
		IntegrClassDemo();
		arraylistEx1();
		arraylistex2();

	}

	static void arraylistex2() {
		ArrayList<String> al = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			al.add(sc.next());
		}
		System.out.println(al);
		if (al.contains("hi")) {
			al.remove("hi");
		}
		System.out.println(al);
		for (int i = 0; i < al.size(); i++) {
			System.out.print(" " + al.get(i));

		}
		System.out.println();
		al.forEach((list) -> System.out.print(" " + list)); // Lambda function

	}

	static void arraylistEx1() {

		ArrayList<Integer> al = new ArrayList<>();
		System.out.println(al.size());
		al.ensureCapacity(5);
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(4);
		al.add(0, 5);
		System.out.println(al);
		System.out.println(al.size());

	}

	static void IntegrClassDemo() {
		Integer x = 5;
		System.out.println(x.intValue());
	}

	public static byte[] sizeOf(Object obj) throws java.io.IOException {
		ByteArrayOutputStream byteObject = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteObject);
		objectOutputStream.writeObject(obj);
		objectOutputStream.flush();
		objectOutputStream.close();
		byteObject.close();

		return byteObject.toByteArray();
	}

}
