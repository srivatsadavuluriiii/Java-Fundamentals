public class a_star {

    public static void main(String[] args) {
        int[][] grid = {
            { 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0 },
        };
        int[] start = { 0, 0 };
        int[] end = { 5, 5 };
        int[] result = aStar(grid, start, end);
        System.out.println("The path is:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] aStar(int[][] grid, int start[], int[] end) {
        int[] result = new int[grid.length * grid[0].length];
        int[] dx = { 1, 0, -1, 0 };
        int[] dy = { 0, 1, 0, -1 };
        int n = grid.length;
        int m = grid[0].length;
        int[][] parent = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        int[][] g = new int[n][m];
        int[][] h = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                g[i][j] = Integer.MAX_VALUE;
                h[i][j] = Integer.MAX_VALUE;
                parent[i][j] = -1;
            }
        }

        g[start[0]][start[1]] = 0;
        h[start[0]][start[1]] = Math.abs(start[0] - end[0]) +
        Math.abs(start[1] - end[1]);
        int[] current = start;

        while (current[0] != end[0] || current[1] != end[1]) {
            visited[current[0]][current[1]] = true;
            for (int i = 0; i < 4; i++) {
                int x = current[0] + dx[i];
                int y = current[1] + dy[i];
                if (
                    x >= 0 &&
                    x < n &&
                    y >= 0 &&
                    y < m &&
                    grid[x][y] == 0 &&
                    !visited[x][y]
                ) {
                    if (g[current[0]][current[1]] + 1 < g[x][y]) {
                        g[x][y] = g[current[0]][current[1]] + 1;
                        h[x][y] = Math.abs(x - end[0]) + Math.abs(y - end[1]);
                        parent[x][y] = current[0] * m + current[1];
                    }
                }
            }
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (!visited[i][j] && g[i][j] + h[i][j] < min) {
                        min = g[i][j] + h[i][j];
                        current[0] = i;
                        current[1] = j;
                    }
                }
            }
        }

        int index = 0;
        while (current[0] != start[0] || current[1] != start[1]) {
            result[index++] = current[0] * m + current[1];
            int x = current[0];
            int y = current[1];
            current[0] = parent[x][y] / m;
            current[1] = parent[x][y] % m;
        }
        result[index++] = start[0] * m + start[1];
        int[] path = new int[index];
        for (int i = 0; i < index; i++) {
            path[i] = result[index - i - 1];
        }
        return path;
    }
}
