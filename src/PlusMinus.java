import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
////        Map<String,Integer> mapValue = new LinkedHashMap<>();
////
////        for(Integer val : arr){
////            if(val > 0){
////                mapValue.merge("positive", 1, Integer::sum);
////            }else if(val == 0){
////                mapValue.merge("zero", 1, Integer::sum);
////            } else {
////                mapValue.merge("negative", 1, Integer::sum);
////            }
////        }
////
////        System.out.printf("%.5f%n", mapValue.get("positive") / (double) arr.size());
////
////        System.out.printf("%.5f%n", mapValue.get("negative") / (double) arr.size());
////
////        System.out.printf("%.5f%n", mapValue.get("zero") / (double) arr.size());
////
        int n = arr.size();
        int positive = 0, negative = 0, zero = 0;

        for(int num : arr){
            if(num > 0){
                positive++;
            }else if(num < 0){
                negative++;
            }else{
                zero++;
            }
        }

        System.out.printf("%.6f%n",(double)positive/n);
        System.out.printf("%.6f%n",(double)negative/n);
        System.out.printf("%.6f%n",(double)zero/n);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        PlusMinus.plusMinus(arr);

        bufferedReader.close();
    }
}