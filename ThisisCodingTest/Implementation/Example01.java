import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example01 {
    static boolean checkLandU(int x, int y, String input) {
        if (x == 1 && "U".equals(input))
            return false;
        if (y == 1 && "L".equals(input))
            return false;
        return true;
    }

    static boolean checkRandD(int x, int y, int max, String input) {
        if (x == max && "R".equals(input))
            return false;
        if (y == max && "D".equals(input))
            return false;
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int maxLength = Integer.parseInt(st.nextToken());
        int initX = 1;
        int initY = 1;
        st = new StringTokenizer(br.readLine(), " ");

        while (st.hasMoreTokens()) {
            String input = st.nextToken();
            if ("R".equals(input) && checkRandD(initX, initY, maxLength, input))
                initY++;
            else if ("D".equals(input) && checkRandD(initX, initY, maxLength, input))
                initX++;
            else if ("U".equals(input) && checkLandU(initX, initY, input))
                initX--;
            else if ("L".equals(input) && checkLandU(initX, initY, input))
                initY--;
        }
        System.out.println(initX + " " + initY);
    }
}
