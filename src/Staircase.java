import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Staircase {

    public static void staircase(int n) {
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            for(int m = 1 ; m<=i ; m++){
                System.out.print("#");
            }
            System.out.println();
        }

    }

}

class StaircaseSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Staircase.staircase(n);

        bufferedReader.close();
    }
}