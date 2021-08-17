import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int havingMoney = 1000;
        int[] coinUnits = {500, 100, 50, 10, 5, 1};
        int payMoney = Integer.parseInt(st.nextToken());
        int change = havingMoney - payMoney;
        int index =0;
        int divideCount =0;
        int countSum=0;

        while(change != 0){
            if(change >= coinUnits[index]){
                divideCount = change / coinUnits[index];
                change -= divideCount*coinUnits[index];
                countSum+=divideCount;
            }
            index++;
        }
        System.out.println(countSum);
    }
}
