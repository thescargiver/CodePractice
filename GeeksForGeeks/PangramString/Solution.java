package GeeksForGeeks.PangramString;

class Solution {
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram(String s) {
        // your code here
        
        // only 26 letters.
        // only 26 ones
        // our valid string / array 
        // 1 1 1 1 1 1 ... (26)
        int required = 1 << 26;
        // 1 0 0 0 0 ...  (27)
        required -= 1;
        // 1 1 1 1 1  ... (26)
        
        // 1 * len(s) [worst case]
        // best case :: only 26 iteration abcdefgh...z
        int currentSituation = 0;
        for (char ch : s.toCharArray()) {
            if (!Character.isLetter(ch)) {
                continue;
            }
            char lowerLetter = Character.toLowerCase(ch);
            currentSituation |= 1 << (lowerLetter - 'a');
            
            // optional
            if (currentSituation == required) return true;
        }
        
        return currentSituation == required;
    }
}
