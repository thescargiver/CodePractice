class Solution {
    public void sortColors(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        /**
         * The countTable will store count of 3 number's
         * As, these 3 numbers are the content within the array
         * ie,
         * countTable[0] -> count of zero within the source array
         * countTable[1] -> for 1 and so for countTable[2]
         */
        int[] countTable = new int[3];

        for (int number : array) {
            countTable[number] += 1;
        }

        for (int i = 0; i < array.length; i++) {
            // here we need to look for 3 content
            // ie, 0 then 1 and then 2
            // better to use for loop than writing 3 different 
            // if statements and having same logic within it.
            for (int contnet = 0; contnet < 3; contnet++) {
                if (countTable[contnet] >= 1) {
                    // we need to put zero here in array
                    array[i] = contnet;
                    
                    // now the content has been used 
                    // we need to decrement the count 
                    // from the count table
                    countTable[contnet] -= 1;

                    // break the loop so we can get a next 
                    // value for the i'th position within an array
                    break;
                }
            }
        }
        // array is sorted
    }
}
