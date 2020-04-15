public class Driver {
    public static void main(String args[]) {
        Solution s = new Solution();

        int[] data = new int[]{3, 7, 1, 3, 9};

        int data2[][] = new int[][]{
                {1,2,4,2,5},
                {5,3,5,3,2}};

       // System.out.println("FibMemoized: "+ s.fibMemoized(9, new int[10]));

        System.out.println("FibBottomUp: "+ s.fibBottomUp(9));
    }
}
