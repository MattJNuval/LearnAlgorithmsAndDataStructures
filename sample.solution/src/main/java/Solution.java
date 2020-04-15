public class Solution {

    /**
     * When it comes to Dynamic Programming there are 3 Steps to follow:
     * Step 1: Answer the problem normally (Naive Recursive Solution)
     * Step 2: Convert your answer to a Memoization solution (If possible)
     * Step 3: Convert that Memoization Solution in to a Bottom Up solution (If possible)
     */


    public void printList(int data[]) {
        System.out.print("[");
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
        System.out.print("]");
        System.out.println();
    }

    public int fibMemoized(int data, int memo[]) {
        int results = 0;
        if(data == memo[data]) {
            return memo[data];
        }
        if(data <= 2) {
            results = 1;
            memo[data] = results;
        } else {
            results = fibMemoized(data-1, memo) + fibMemoized(data-2, memo);
            memo[data] = results;
            printList(memo);
        }
        return results;
    }

    public int fibBottomUp(int data) {
        int dp[] = new int[data+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for(int i = 3; i < data+1; i++) {
            dp[i] = dp[i-1] + dp[i-2];
            printList(dp);
        }
        return dp[data];
    }

}
