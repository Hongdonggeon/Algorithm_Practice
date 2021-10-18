import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int maxLength = Integer.parseInt(st.nextToken());
        int initX = 1, initY = 1;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] directions = {'L', 'R', 'U', 'D'};

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            char direction = st.nextToken().charAt(0);
            int nx = 0, ny = 0;
            for (int i = 0; i < 4; i++) {
                if (direction == directions[i]) {
                    nx = initX + dx[i];
                    ny = initY + dy[i];
                }
            }
            if (nx < 1 || ny < 1 || nx > maxLength || ny > maxLength)
                continue;
            initX = nx;
            initY = ny;
        }
        System.out.println(initX + " " + initY);
    }
}
