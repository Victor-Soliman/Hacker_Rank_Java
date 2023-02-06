package JavaProblems.Algorithms.sorting.easy.BigSorting;

import java.io.*;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'bigSorting' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY unsorted as parameter.
     */

    public static List<String> bigSorting(List<String> unsorted) {
        // Write your code here
        // first solution
//        List<String> sorted = new ArrayList<>();
//        List<BigInteger> list = new ArrayList<>();

//        for (String temp : unsorted) {
//            BigInteger b = new BigInteger(temp);
//            list.add(b);
//        }
//        list.sort(Comparator.naturalOrder());

//        for (BigInteger big : list) {
//            String value = String.valueOf(big);
//            sorted.add(value);
//        }
//        list.stream().forEach(bigInteger -> sorted.add(String.valueOf(bigInteger)));
//        return sorted;


        Collections.sort(unsorted, new Comparator<String>(){
                    public int compare(String a, String b){
                        if(a.length() > b.length()){
                            return 1;
                        }
                        else if(a.length() < b.length()){
                            return -1;
                        }
                        else {
                            BigInteger b1 = new BigInteger(a);
                            BigInteger b2 = new BigInteger(b);
                            return b1.compareTo(b2);
                        }
                    }
                }
        );
        return unsorted;


    }

}

public class BigSorting {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> unsorted = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<String> result = Result.bigSorting(unsorted);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
