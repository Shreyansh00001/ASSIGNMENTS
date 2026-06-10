import java.util.HashMap;

public class longestsubstringwithoutrepeatingcharacters{
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            char r = s.charAt(right);
            if (map.containsKey(r)) {
                left = Math.max(map.get(r) + 1, left);
            }
            map.put(r, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}