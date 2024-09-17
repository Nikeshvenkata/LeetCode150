package Array_String.HashMap;

import java.util.HashMap;

public class RansomeNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            hm.put(magazine.charAt(i), 1 + hm.getOrDefault(magazine.charAt(i), 0));
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (hm.containsKey(c) && hm.get(c) > 0) {
                hm.put(c, hm.get(c) - 1);
            }else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));

        System.out.println(Math.pow(2, -2));
    }
}
