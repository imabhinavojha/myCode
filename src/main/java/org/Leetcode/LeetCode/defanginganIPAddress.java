package org.Leetcode.LeetCode;

public class defanginganIPAddress {
    public static void main(String[] args) {
        defanginganIPAddress obj = new defanginganIPAddress();
        String address = "1.1.1.1";
        obj.defangIPaddr(address);
    }

    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                sb.append("[.]");
            } else {
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }

}
