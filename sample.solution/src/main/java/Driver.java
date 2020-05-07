public class Driver {
    public static void main(String args[]) {
        FibonacciSolution s = new FibonacciSolution();

        int[] data = new int[]{3, 7, 1, 3, 9};

        int data2[][] = new int[][]{
                {1,2,4,2,5},
                {5,3,5,3,2}};

       // System.out.println("FibMemoized: "+ s.fibMemoized(9, new int[10]));

        System.out.println("FibBottomUp: "+ s.fibBottomUp(9));

        KnapsackSolution s2 = new KnapsackSolution();

        int weight[] = new int[]{1,2,4,2,5};
        int value[] = new int[]{5,3,5,3,2};
        int n = value.length;
        int capacity = 5;
        int knapsackResults = s2.solution(value, weight, n, capacity, new int[n+1][capacity+1]);
        System.out.println("Knapsack Memoized: "+knapsackResults);

        int knapsackResults2 = s2.bottonUpSolution(value, weight, n, capacity);
        System.out.println("Knapsack Bottom Up: "+knapsackResults);
    }
}
