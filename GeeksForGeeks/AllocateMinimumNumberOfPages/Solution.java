class Solution  {
    static int getStudents(int[] a, int probePages) {
        int studentCnt = 1;
        int curPages = 0;
        for (int page : a) {
            if (page + curPages > probePages) {
                // we got more than expected for 1 student
                // inc. student count
                studentCnt++;
                curPages = page;
            } else {
                // assign the cur student this page
                curPages += page;
            }
        }
        return studentCnt;
    }
    
    //Function to find minimum number of pages.
    public static int findPages(int[]a, int N,int M) {
        //Your code here
        // edge cases 
        if (a == null || a.length == 0 || M > a.length) {
            // in all such cases we cannot find max pages
            return -1;
        }
        
        int l = Arrays.stream(a).max().getAsInt();
        int r = Arrays.stream(a).sum();
        
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int minStudents = getStudents(a, mid);
            if (minStudents <= M) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        
        // ideally this should not execute
        return l;
    }
};
