import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        long sumFirst = 0;
        long lastFirst = 0;


        Collections.sort(arr);

        for(int i = 0 ; i<arr.size()-1 ; i++){
            sumFirst += arr.get(i);
        }

        for(int i = 1 ; i<arr.size() ; i++){
            lastFirst += arr.get(i);
        }

        System.out.print( sumFirst+ " " +lastFirst );


    }
}
class SolutionMiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        MiniMaxSum.miniMaxSum(arr);

        bufferedReader.close();
    }
}
