package org.Leetcode.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class nestedArray {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x>y || z<=0) {
            System.out.println(al);
            
        }else{
            while (x <= y) {
                ArrayList<Integer> innerList = new ArrayList<>();
                innerList.add(x);
                x = x + z;
                if (x > y) {
                    innerList.add(y);
                } else {
                    innerList.add(x);
                }
                al.add(innerList);
            }
            System.out.println(al);
        }

    }

}
