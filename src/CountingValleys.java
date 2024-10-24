import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class CountingValleys {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        char[] paths = path.toCharArray();
        int sum = 0;
        int valleys = 0;
        boolean isM = false;
        for (int i = 0; i < paths.length; i++) {
            if (paths[i] == 'U') {
                sum++;
            } else {
                sum--;
            }

            if(sum > 0){
                isM = true;
            }

            if(sum == 0 ){
                if(isM){
                    isM = false;
                }else {
                    valleys ++;
                }
            }
        }

        if(sum < 0){
            valleys ++;
        }

        return valleys;

    }

}

class CountingValleysSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = CountingValleys.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
