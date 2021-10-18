import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node {
    private int x;
    private int y;
    private int distance;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

public class Search02 {
    static int[][] array = new int[201][201];
    static boolean[][] visited = new boolean[201][201];
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int row;
    static int col;


    static int bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        visited[x][y] = true;
        q.offer(new Node(x, y));
        while (!q.isEmpty()) {
            Node node = q.poll();
            x = node.getX();
            y = node.getY();
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= row || ny >= col)
                    continue;

                if (array[nx][ny] == 1 && !visited[nx][ny]) {
                    q.offer(new Node(nx, ny));
                    array[nx][ny] = array[x][y] + 1;
                }
            }
        }
        return array[row - 1][col - 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());

        for (int i = 0; i < row; i++) {
            String s = br.readLine();
            String[] split = s.split("");
            for (int j = 0; j < col; j++) {
                array[i][j] = Integer.parseInt(split[j]);
            }
        }

        System.out.println(bfs(0, 0));
    }
}
