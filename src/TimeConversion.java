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

class TimeConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        String[] vals = s.split(":");
        String firstVal = vals[0];
        if(s.contains("AM")){
            if(firstVal.equals("12")){
                vals[0] = "00";
            }
        }else if (s.contains("PM")) {
            if(!firstVal.equals("12")){
                vals[0] = String.valueOf(Integer.parseInt(firstVal)+11);
            }
        }
        StringBuilder buffer = new StringBuilder();
        for(int i = 0 ; i < vals.length-1 ; i++){
            buffer.append(vals[i]);
            if(i != vals.length-1){
                buffer.append(":");
            }
        }
        return buffer.substring(0,buffer.length()-2);
    }

}

 class SolutionTimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = TimeConversion.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
