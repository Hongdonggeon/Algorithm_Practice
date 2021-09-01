import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sort01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String inputValue = st.nextToken();
        char initX = inputValue.charAt(0);
        int initY = Integer.parseInt(inputValue.substring(1));
        int[] dx = {2, 2, -2, -2, 1, -1, 1, -1};
        int[] dy = {1, -1, 1, -1, 2, 2, -2, -2};
        int count = 0;

        for (int i = 0; i < dx.length; i++) {
            int nx = 0, ny = 0;
            nx = initX + dx[i];
            ny = initY + dy[i];
            if (nx < 97 || nx > 104 || ny < 1 || ny > 8)
                continue;
            count++;
        }
        System.out.println(count);
    }
}
