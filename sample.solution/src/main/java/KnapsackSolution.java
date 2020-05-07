public class KnapsackSolution {


    public void printList(int data[][]) {

        for(int i = 0; i < data.length; i++) {
            System.out.print("[");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + ", ");
            }
            System.out.print("]");
            System.out.println();

        }


    }

    // Memoized Solution O(nC)
    public int solution(int value[], int weight[], int n, int capacity, int memo[][]) {
        int results = 0;
        if(memo[n][capacity] != 0) {
            return memo[n][capacity];
        }
        // if we gone through the items or exhausted out capacity
        if(n == 0 || capacity == 0) {
            results = 0;
            // if the current item weight exceeds the current capacity
        } else if(weight[n-1] > capacity) {
            // Move on to the next item without updating capacity
            results = solution(value, weight, n-1, capacity, memo);
        } else {
            // Move on to the next item without updating capacity
            int optionOne = solution(value, weight, n-1, capacity, memo);
            // Add new item in knapsack and update capacity
            int optionTwo = value[n-1] + solution(value, weight, n-1, capacity - weight[n-1], memo);
            results = Math.max(optionOne, optionTwo);
        }
        memo[n][capacity] = results;
        return results;
    }

    public int bottonUpSolution(int value[], int weight[], int n, int capacity) {
        int solution[][] = new int[n+1][capacity+1];
        // Initialize currentCapacity of the 0th row to 0
        for(int currentCapacity  = 0; currentCapacity < capacity; currentCapacity++) {
            solution[0][currentCapacity] = 0;
        }
        // Loops through the items
        for(int currentItem = 1; currentItem < n; currentItem++) {
            // Loops through the capacity
            for(int currentCapacity = 0; currentCapacity < capacity; currentCapacity++) {
                // If the weight of the current item has passed the current capacity
                if(weight[currentItem] > currentCapacity) {
                    // Store the value of the current item and current capacity in the solution
                    solution[currentItem][currentCapacity] = solution[currentItem-1][currentCapacity];
                } else {
                    // Move on to the next item without updating capacity
                    int optionOne = solution[currentItem-1][currentCapacity];
                    // Add new item in knapsack and update capacity
                    int optionTwo = value[currentItem] + solution[currentItem-1][currentCapacity - weight[currentItem]];
                    solution[currentItem][currentCapacity] = Math.max(optionOne, optionTwo);
                }
            }
        }
        return solution[n][capacity];
    }

}
