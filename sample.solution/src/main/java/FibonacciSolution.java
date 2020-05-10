public class FibonacciSolution {

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

    public int solution(int data) {
        int results = 0;
        if(data <= 0) {
            results = 0;
        } else if(data == 1) {
            results = 1;
        } else {
            results = solution(data-1) + solution(data-2);
        }
        return results;
    }

    public int memoizedSolution(int data, int memo[]) {
        int results = 0;

        if(memo[data] != 0) {
            return memo[data];
        }
        if(data <= 0) {
            results = 0;
        } else if(data == 1) {
            results = 1;
        } else {
            results = memoizedSolution(data - 1, memo) + memoizedSolution(data - 2, memo);
        }
        memo[data] = results;
        return results;
    }

    public int bottomUpSolution(int data) {
        int solution[] = new int[data+1];

        for(int i = 0; i <= data; i++) {
            if(i <= 0) {
                solution[i] = 0;
            } else if(i == 1){
                solution[i] = 1;
            } else {
                solution[i] = solution[i-1] + solution[i-2];
            }
        }
        return solution[data];
    }
}
