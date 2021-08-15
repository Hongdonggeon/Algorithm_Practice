import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class Practice02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        int[][] array = new int[row][col];
        ArrayList<Integer> smalls = new ArrayList<>();

        for(int i=0; i<row; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<col; j++){
                array[i][j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(array[i]);
            smalls.add(array[i][0]);
        }

        Collections.sort(smalls);
        int biggest = smalls.get(smalls.size()-1);
        System.out.println(biggest);
    }
}
