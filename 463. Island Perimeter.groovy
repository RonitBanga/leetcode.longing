// 463. Island Perimeter

class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 0)
                    continue;
                perimeter += (i == 0 || grid[i - 1][j] == 0) ? 1 : 0;
                perimeter += (i == row - 1 || grid[i + 1][j] == 0) ? 1 : 0;
                perimeter += (j == 0 || grid[i][j - 1] == 0) ? 1 : 0;
                perimeter += (j == col - 1 || grid[i][j + 1] == 0) ? 1 : 0;
            }
        }
        return perimeter;
    }
}