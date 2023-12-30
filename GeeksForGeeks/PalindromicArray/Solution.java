/*Complete the Function below*/
class GfG {
    static int reverseNumber(int number) {
        int rev = 0;
        
        // number = 13
        while (number > 0) {
            // last = 3
            // last = 1
            int last = number % 10;
            
            // we need to take this last number to
            // front while considering the rev.
            
            // update reverse
            // rev = 0 + 3
            // rev = 3 * 10 + 1 = 31
            rev = rev * 10 + last;
            
            // getting rid of last number
            // number = 13 / 10 => 1
            number /= 10;
        }
        
        return rev;
    }
    
    static boolean isPalindrome(int number) {
        final int forwardRead = number;
        final int backwardRead = reverseNumber(number);
        
        return forwardRead == backwardRead;
    }
    
	public static int palinArray(int[] a, int n) {
	    //add code here.
        for (int number : a) {
            if (! isPalindrome(number)) {
                return 0;
            }
        }
      
        // control will be here
        return 1;
   }
}
