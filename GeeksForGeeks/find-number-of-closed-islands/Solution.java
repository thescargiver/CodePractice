import java.util.Arrays;

class Solution {
    boolean directTerminate = false;

    private void printMatrix(int[][] a) {
        System.out.println("--------------------");
        for (int[] x : a) {
            System.out.println(Arrays.toString(x));
        }
    }

    public int closedIslands(int[][] a, int N, int M) {
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                directTerminate = false;
                cnt += dfs(a, i, j);
            }
            // printMatrix(a);
            // System.out.println("cnt == " + cnt);
        }
        return cnt;
    }

    private int dfs(int[][] a, int i, int j) {
        if (i < 0 || i >= a.length || j < 0 || j >= a[i].length) {
            return 0;
        }

        if (a[i][j] == 0) {
            return 0;
        }

        if (i == 0 || i == a.length - 1 || j == 0 || j == a[i].length-1) {
            directTerminate = true;
        }

        a[i][j] = 0;
        dfs(a, i+1, j);
        dfs(a, i-1, j);
        dfs(a, i, j+1);
        dfs(a, i, j-1);

        return directTerminate? 0 : 1;
    }
}

