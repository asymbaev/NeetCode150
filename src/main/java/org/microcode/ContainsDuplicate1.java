package org.microcode;

import java.util.HashSet;

public class ContainsDuplicate1 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> cDup = new HashSet<Integer>();
        for (int n: nums) {
            if (cDup.contains(n)) {
                return true;
            }
            cDup.add(n);
        }
        return false;
    }
}
