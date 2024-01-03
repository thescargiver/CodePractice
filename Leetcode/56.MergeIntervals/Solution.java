class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null && intervals.length == 0) {
            throw new IllegalArgumentException();
        }
        Arrays.sort(intervals, (int1, int2) -> {
            return int1[0] - int2[0];
        });

        List<int[]> res = new ArrayList<>();
        int start = 0;
        res.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            if (isOverlap(res.get(start), intervals[i])) {
                // we merge
                res.get(start)[1] = Math.max(res.get(start)[1], intervals[i][1]);
            } else {
                // we inc. the counter
                start++;
                res.add(intervals[i]);
            }
        }
        
        return toArray(res);
    }

    int[][] toArray(List<int[]> list) {
        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    private boolean isOverlap(int[] a, int[] b) {
        if (a[1] < b[0]) {
            return false;
        }
        return true;
    }
}