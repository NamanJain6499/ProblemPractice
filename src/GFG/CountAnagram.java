package GFG;

import java.util.HashMap;

public class CountAnagram {
    public static void main(String[] args) {
        String txt = "forxxorfxdofr";
        String pat = "for";
        System.out.println(search(pat, txt));
    }

    private static int search(String pat, String txt) {
        int k = pat.length();
        int i = 0;
        int j = 0;
        int index = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (j < k) {
            if (map.containsKey(pat.charAt(j))) {
                map.put(pat.charAt(j), map.get(pat.charAt(j)) + 1);
            } else {
                map.put(pat.charAt(j), 1);
            }

            j++;
        }
        j = 0;
        int ans = 0;
        int count = map.size();
        while (j < txt.length()) {
            if (map.containsKey(txt.charAt(j))) {
                map.put(txt.charAt(j), map.get(txt.charAt(j)) - 1);
                if (map.get(txt.charAt(j)) == 0) {
                    count--;
                }
            }


            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (count == 0) {
                    ans++;
                }
                if (map.containsKey(txt.charAt(i))) {
                    map.put(txt.charAt(i), map.get(txt.charAt(i)) + 1);
                    if (map.get(txt.charAt(i)) > 0) {
                        count++;
                    }
                }
                i++;
                j++;
            }

        }
        return ans;
    }
}
