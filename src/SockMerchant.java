import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class SockMerchant {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {

        int connection = 0;

        List<Integer> newAr = new ArrayList<>();

        for(Integer val : ar){
            if(newAr.contains(val)){
                continue;
            }
            newAr.add(val);
            long count = ar.stream().filter(t -> t == val).count();
            if(count > 1){
                connection +=  (count/2);
            }
        }

        return connection;

    }

}

class SockMerchantSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = SockMerchant.sockMerchant(n, ar);



        bufferedReader.close();
    }
}
