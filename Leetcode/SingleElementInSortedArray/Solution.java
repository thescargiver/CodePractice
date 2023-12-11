class Solution {
    public int singleNonDuplicate(int[] a) {
        if (a.length % 2 == 0) {
            return -1;
        }

        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (mid + 1 <= r && a[mid] == a[mid+1]) {
                // nop
            } else if (mid - 1 >= l && a[mid] == a[mid - 1]) {
                mid = mid - 1;
            } else {
                return a[mid];
            }
            int next = mid + 1;

            int onLeft = mid - 0;
            int onRight = a.length - next - 1;

            if (onLeft % 2 == 1) {
                r = mid - 1;
            } else {
                l = next + 1;
            }
        }
        return a[l];
    }
}
