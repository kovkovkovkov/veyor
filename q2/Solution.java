import java.io.*;

public class Solution {
    // Complete the maxMoney function below.
    static int maxMoney(int n, long k) {
        long result = (k * (k + 1)) / 2;

        if (k == 1) {
            result = (n * (n + 1)) / 2;
        }

        long x = 8 * k + 1;
        long y = (long) Math.sqrt(x);
        if (Math.pow(y, 2) == x) {
            result -= 1;
        }
        
        return (int) result % 1000000007;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.out));
        
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        long k = Long.parseLong(bufferedReader.readLine().trim());
        int res = maxMoney(n, k);

        System.out.println(res);

        // bufferedWriter.write(String.valueOf(res));
        // bufferedWriter.newLine();
        // bufferedReader.close();
        // bufferedWriter.close();
    }
}

/**
Tests:
- Early contstraint
- Late constraint

1
- unsorted
- sorted
- unsorted with 
*/