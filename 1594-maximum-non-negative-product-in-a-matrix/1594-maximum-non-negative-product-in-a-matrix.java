class Solution {
  public int maxProductPath(int[][] grid) {
    final int mod = 1_000_000_007;
    final int rows = grid.length;
    final int columns = grid[0].length;
    long[][] dpMin = new long[rows][columns];
    long[][] dpMax = new long[rows][columns];

    dpMin[0][0] = dpMax[0][0] = grid[0][0];

    for (int i = 1; i < rows; ++i)
      dpMin[i][0] = dpMax[i][0] = dpMin[i - 1][0] * grid[i][0];

    for (int j = 1; j < columns; ++j)
      dpMin[0][j] = dpMax[0][j] = dpMin[0][j - 1] * grid[0][j];

    for (int i = 1; i < rows; ++i)
      for (int j = 1; j < columns; ++j)
        if (grid[i][j] < 0) {
          dpMin[i][j] = Math.max(dpMax[i - 1][j], dpMax[i][j - 1]) * grid[i][j];
          dpMax[i][j] = Math.min(dpMin[i - 1][j], dpMin[i][j - 1]) * grid[i][j];
        } else {
          dpMin[i][j] = Math.min(dpMin[i - 1][j], dpMin[i][j - 1]) * grid[i][j];
          dpMax[i][j] = Math.max(dpMax[i - 1][j], dpMax[i][j - 1]) * grid[i][j];
        }

    final long max = Math.max(dpMin[rows - 1][columns - 1], dpMax[rows - 1][columns - 1]);
    return max < 0 ? -1 : (int) (max % mod);
  }
}
