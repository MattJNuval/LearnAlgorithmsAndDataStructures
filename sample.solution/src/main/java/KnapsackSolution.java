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

    public int bottonUpSolution(int value[], int weight[], int items, int capacity) {
        int solution[][] = new int[items+1][capacity+1];

        for(int currentItem = 0; currentItem <= items; currentItem++) {
            for(int currentCapacity = 0; currentCapacity <= capacity; currentCapacity++) {

               if(currentItem == 0 || currentCapacity == 0) {
                    solution[currentItem][currentCapacity] = 0;
                } else if(weight[currentItem-1] > currentCapacity) {
                    solution[currentItem][currentCapacity] = solution[currentItem-1][currentCapacity];
                } else {
                    int optionOne = solution[currentItem-1][currentCapacity];
                    int optionTwo = value[currentItem-1] + solution[currentItem-1][currentCapacity - weight[currentItem-1]];
                    solution[currentItem][currentCapacity] = Math.max(optionOne, optionTwo);
                }



            }
        }
        return solution[items][capacity];
    }

}
