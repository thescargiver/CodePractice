import java.util.Queue;
import java.util.LinkedList;

class Solution {
    void bfs(char[][] a, int i, int j) {
        final Queue<int[]> queue = new LinkedList<>();
        a[i][j] = '0';
        queue.offer(new int[]{i, j});
        while(!queue.isEmpty()) {
            int[] pos = queue.poll();
            i = pos[0]; j = pos[1];
            if(j+1 < a[i].length && a[i][j+1] == '1' ) {
                a[i][j+1] = '0';
                queue.offer(new int[] {i, j+1});
            }
            if(i+1 < a.length && a[i+1][j] == '1' ) {
                a[i+1][j] = '0';
                queue.offer(new int[] {i+1, j});
            }
            if(j-1 >= 0 && a[i][j-1] == '1' ) {
                a[i][j-1] = '0';
                queue.offer(new int[] {i, j-1});
            }
            if(i-1 >= 0 && a[i-1][j] == '1' ) {
                a[i-1][j] = '0';
                queue.offer(new int[] {i-1, j});
            }
        }
    }
    public int numIslands(char[][] a) {
        int cnt = 0;
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++) {
                if( a[i][j] == '1' ) {
                    cnt++;
                    bfs(a, i, j);
                }
            }
        }
        return cnt;
    }
}
