class Solution {
    public void sortColors(int[] a) {
         if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        // take 3 pointers 
        // where we can insert the elemts 
        // we can say this as
        // low, mid and high
        // for 0 1 and 2
        int low = 0;
        int mid = 0;
        // as 2 can be always appended to the end (being highest)
        int high = a.length - 1;

        while (mid <= high) {
            switch (a[mid]) {
                case 2:
                    // here we need to insert at the high position
                    // and decrement the pointer for any upcoming 2
                    

                    // swap the high and mid as it's quite possible 
                    // that while inserting to high original value within 
                    // that place would be lost, 
                    // which is what we do not want to occur
                    swap(a, high, mid);
                    high -= 1;
                    break;

                case 1:
                    // it's alright to find 1 at place of mid 
                    // it is what is meant to
                    // only thing to do is check for the next position
                    mid++;
                    break;

                case 0:
                    // here if we see any 0 we insert into low place 
                    // and increment the pointer for any upcoming 0
                    
                    // at this point we found 0 at mid.
                    // give this from mid to low
                    // as low have all zero 
                    // best way to exchange an element is by swap
                    swap(a, low, mid);
                    low++;
                    mid++;
                    break;

                default:
                    throw new IllegalArgumentException("Corrupted array!");
            }
        }
        // sorted
    }

    void swap(int[] a, int l, int r) {
        int t = a[l];
        a[l] = a[r];
        a[r] = t;
    }
}
