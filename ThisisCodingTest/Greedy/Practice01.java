import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Practice01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(st.nextToken()); // 배열의 크기
        int m = Integer.parseInt(st.nextToken()); /// 숫자가 더해지는 횟수
        int k = Integer.parseInt(st.nextToken()); // 한 숫자가 연속으로 최대 올 수 있는 횟수
        ArrayList<Integer> arrayList = new ArrayList<>();
        st = new StringTokenizer(bufferedReader.readLine());
        for (int i=0; i<n; i++){
            arrayList.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arrayList);

        int biggestCount = m/(k+1)*k;
        biggestCount += m %(k+1);
        int secondCount = m - biggestCount;
        int total; // 최대합
        total = biggestCount*arrayList.get(arrayList.size()-1) + secondCount*arrayList.get(arrayList.size()-2);
        System.out.println(total);
    }
}
