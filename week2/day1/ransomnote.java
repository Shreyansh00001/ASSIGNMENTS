public class ransomnote{
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        
        int[] counts = new int[26];
        
        for (int i = 0; i < magazine.length(); i++) {
            counts[magazine.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a';
            counts[index]--;
            if (counts[index] < 0) {
                return false;
            }
        }
        
        return true;
    }
}