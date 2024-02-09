class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null) {
            throw new IllegalArgumentException();
        }
        // we check if the cell is island
        // we go iter it
        // then post itr. we go to the next cell

        // we keep track of islands visited

        int cnt = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                cnt += isIsland(grid, i, j)? 1 : 0;
            }
        }

        return cnt;
    }


    boolean isIsland(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 
            || i >= grid.length 
            || j >= grid[i].length) {

            // state is invalid
            return false;
        }

        if (grid[i][j] == '0') {
            // it is sea
            return false;
        }

        // we found an island

        grid[i][j] = '0';

        isIsland(grid, i + 1, j);
        isIsland(grid, i - 1, j);
        isIsland(grid, i, j + 1);
        isIsland(grid, i, j - 1);

        return true;
    }
}
