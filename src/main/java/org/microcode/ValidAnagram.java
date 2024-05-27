package org.microcode;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

//        char[] sArray = s.toCharArray();
//        char[] tArray = t.toCharArray();
//
//        Arrays.sort(sArray);
//        Arrays.sort(tArray);
//
//        return Arrays.equals(sArray, tArray);

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            countS.put(chS, 1  + countS.getOrDefault(chS, 0));
            char chT = t.charAt(i);
            countT.put(chT, 1 + countT.getOrDefault(chT, 0));

        }

        for (Character c : countT.keySet()) {
            if (!countT.getOrDefault(c, 0).equals(countS.get(c))) {
                return false;
            }
        }
        return true;
    }
}
