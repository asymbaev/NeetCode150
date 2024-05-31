package org.microcode;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecode {
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String str : strs) {
            encoded.append(str.length()).append('#').append('#').append(str);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int delimiterIndex = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, delimiterIndex));
            i = delimiterIndex + 1 + length;
            decoded.add(str.substring(delimiterIndex + 1, i));
        }
        return decoded;
    }
}
