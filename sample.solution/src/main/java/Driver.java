

public class Driver {
    public static void main(String args[]) {
        StopWatch stopWatch =  new StopWatch();
        StopWatch stopWatch2 =  new StopWatch();
        StopWatch stopWatch3 =  new StopWatch();

        KnapsackSolution s2 = new KnapsackSolution();

        stopWatch.start();
        int knapsackResults = s2.solution(new int[]{1,2,5,6}, new int[]{2,3,4,5}, 4, 8);
        stopWatch.stop();

        System.out.println("Knapsack: "+knapsackResults + " Time: " + stopWatch.getElapsedTime());


        stopWatch2.start();
        int knapsackResults2 = s2.memoizedSolution(new int[]{1,2,5,6}, new int[]{2,3,4,5}, 4, 8, new int[4+1][8+1]);
        stopWatch2.stop();

        System.out.println("Knapsack Memoized: "+knapsackResults2 + " Time: " + stopWatch2.getElapsedTime());

        stopWatch3.start();
        int knapsackResults3 = s2.bottonUpSolution(new int[]{1,2,5,6}, new int[]{2,3,4,5}, 4, 8);
        stopWatch3.stop();

        System.out.println("Knapsack Bottom Up: "+ knapsackResults3 + " Time: " + stopWatch3.getElapsedTime());
    }
}
