import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int threeInclusions = 15;
        int sum = 0;
        for (int i = 0; i <= hour; i++) {
            if (i != 3 && i != 13 & i != 23)
                sum += (60 - threeInclusions) * threeInclusions + threeInclusions * 60;
            else
                sum += 60 * 60;
        }
        System.out.println(sum);
    }
}
