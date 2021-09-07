import java.io.*;

// import org.junit.Test;
// import static org.junit.Assert.assertEquals;


public class Solution {
    // Complete the maxMoney function below.
    static int maxMoney(int n, long k) {
        if (n < 1 || n > (2 * Math.pow(10, 9))) {
            return -1;
        }

        if (k < 1 || k > (4 * Math.pow(10, 15))) {
            return -2;
        }

        long result = (n * (n + 1)) / 2;

        if (result >= k) {
            if (k != 1) {
                result = (k * (k + 1)) / 2;
            }

            long x = 8 * k + 1;
            long y = (long) Math.sqrt(x);
            if (Math.pow(y, 2) == x) {
                result -= 1;
            }
        }
        
        return (int) result % 1000000007;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.out));
        
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        long k = Long.parseLong(bufferedReader.readLine().trim());
        int res = maxMoney(n, k);

        String out = Integer.toString(res);

        if (res == -1) {
            out = "Number of classmates must be between 1 and 2000000000";
        } else if (res == -2) {
            out = "Unlucky number must be between 1 and 4000000000000000";
        }
        System.out.println(out);

        // bufferedWriter.write(String.valueOf(res));
        // bufferedWriter.newLine();
        // bufferedReader.close();
        // bufferedWriter.close();
    }

    // @Test
    // public void testnMin() 
    // {
    //     int n = 1; 
    //     long k = 2;
    //     assertEquals(1, maxMoney(n, k));
    // }

    // @Test
    // public void testnMinMinus1() 
    // {
    //     int n = 0; 
    //     long k = 2;
    //     assertEquals(-1, maxMoney(n, k));
    // }

    // @Test
    // public void testnMax() 
    // {
    //     int n = 2000000000;
    //     long k = 2;
    //     assertEquals(TODO, maxMoney(n, k));
    // }

    // @Test
    // public void testnMaxPlus1() 
    // {
    //     int n = 2000000001;
    //     long k = 2;
    //     assertEquals(-1, maxMoney(n, k));
    // }

    // @Test
    // public void testkMin() 
    // {
    //     int n = 1; 
    //     long k = 1;
    //     assertEquals(0, maxMoney(n, k));
    // }

    // @Test
    // public void testkMinMinus1() 
    // {
    //     int n = 1; 
    //     long k = 0;
    //     assertEquals(-2, maxMoney(n, k));
    // }

    // @Test
    // public void testkMax() 
    // {
    //     int n = 1;
    //     long k = (long) (4 * Math.pow(10, 15));
    //     assertEquals(TODO, maxMoney(n, k));
    // }

    // @Test
    // public void testkMaxPlus1() 
    // {
    //     int n = 1;
    //     long k = (long) (4 * Math.pow(10, 15) + 1);
    //     assertEquals(-2, maxMoney(n, k));
    // }
    
    // @Test
    // public void test1() 
    // {
    //     int n = 2;
    //     long k = 2;
    //     assertEquals(3, maxMoney(n, k));
    // }

    // @Test
    // public void test2() 
    // {
    //     int n = 2;
    //     long k = 2;
    //     assertEquals(3, maxMoney(n, k));
    // }

    // @Test
    // public void test3() 
    // {
    //     int n = 3;
    //     long k = 3;
    //     assertEquals(5, maxMoney(n, k));
    // }
}