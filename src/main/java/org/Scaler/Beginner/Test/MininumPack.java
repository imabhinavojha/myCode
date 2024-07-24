package org.Scaler.Beginner.Test;

import java.util.ArrayList;
import java.util.Collections;

public class MininumPack {
    public static void main(String[] args) {
        MininumPack obj = new MininumPack();
        ArrayList list = new ArrayList();
        list.add(5);     
        list.add(17);
        list.add(100);
        list.add(1);
        
        obj.solve(list);
    }

    public int solve(ArrayList<Integer> A) {
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) % 2 == 0) {
                even.add(A.get(i));
            } else {
                odd.add(A.get(i));
            }
        }
        int e = Collections.max(even);
        int o = Collections.min(odd);
        System.out.println(e+" "+o);
        int result = e - o;
        System.out.println(result);
        return result;
    }

}
