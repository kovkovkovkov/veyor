import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

class LengthComparator implements Comparator<List<Integer>> {
    public int compare(List<Integer> list1, List<Integer> list2) {
        return list1.size() - list2.size(); // sort descending in length
    }
}

class Result {
    /*
    * Complete the 'customSort' function below.
    * The function accepts INTEGER_ARRAY arr as parameter.
    */
    public static void customSort(List<Integer> arr) {
        Collections.sort(arr);

        List<List<Integer>> split_arr = new ArrayList<List<Integer>>();
        Integer curr = arr.get(0);
        Integer start = 0;

        for (Integer i = 1; i < arr.size(); i++) {
            if (curr != arr.get(i)) {
                split_arr.add(arr.subList(start, i));

                curr = arr.get(i);
                start = i;
            }
        }

        split_arr.add(arr.subList(start, arr.size()));
        
        Collections.sort(split_arr, new LengthComparator());
        System.out.println("Output:");

        for (Integer i = 0; i < split_arr.size(); i++) {
            for (Integer j = 0; j < split_arr.get(i).size(); j++) {
                System.out.println(split_arr.get(i).get(j));
            }
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(Collectors.toList());
        Result.customSort(arr);
        
        bufferedReader.close();
    }
}

