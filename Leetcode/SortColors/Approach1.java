class Solution {
    public void sortColors(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        Arrays.sort(a);
    }
}
