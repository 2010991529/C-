import java.util.Arrays;
class UniquePaths{
static int ans = 0;
static void dfs(int i, int j, int[][] grid,boolean[][] vis, int z, int z_count){
	int n = grid.length, m = grid[0].length;
	vis[i][j] = true;
	if (grid[i][j] == 0)
	z++;
	if (grid[i][j] == 2){
	if (z == z_count)
		ans++;
	vis[i][j] = false;
	return;
	}
	if (i >= 1 && !vis[i - 1][j] && grid[i - 1][j] != -1)
	dfs(i - 1, j, grid, vis, z, z_count);
	if (i < n - 1 && !vis[i + 1][j] && grid[i + 1][j] != -1)
	dfs(i + 1, j, grid, vis, z, z_count);
	if (j >= 1 && !vis[i][j - 1] && grid[i][j - 1] != -1)
	dfs(i, j - 1, grid, vis, z, z_count);
	if (j < m - 1 && !vis[i][j + 1] && grid[i][j + 1] != -1)
	dfs(i, j + 1, grid, vis, z, z_count);
	vis[i][j] = false;
}
    static int uniquePaths(int[][] grid){
        int z_count = 0;
        int n = grid.length, m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        for (int i = 0; i < n; i++){
        Arrays.fill(vis[i], false);
        }
        int x = 0, y = 0;
        for (int i = 0; i < n; ++i){
            for (int j = 0; j < m; ++j){
                if (grid[i][j] == 0)
                z_count++;
                else if (grid[i][j] == 1){
                x = i;
                y = j;
                }
            }
        }
        dfs(x, y, grid, vis, 0, z_count);
        return ans;
    }
    public static void main(String[] args){
        int[][] grid = { { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 2, -1 } };
        System.out.println(uniquePaths(grid));
    }
}