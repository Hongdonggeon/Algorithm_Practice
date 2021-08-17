import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 주어진 수
        int k = Integer.parseInt(st.nextToken()); // 나눌 수
        int count = 0; // 1이 되기 위한 연산 횟수

        while(n!=1 && n>1){
            if(n % k==0){
                n/=k;
                count++;
            }
            else {
                n--;
                count++;
            }
        }

        System.out.println(count);
    }
}
