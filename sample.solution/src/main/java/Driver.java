public class Driver {
    public static void main(String args[]) {
        int data[] = new int[]{2,1,3,5,4};

        Solution s = new Solution();

        s.mergeSort(data, 0, data.length-1);

        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
    }
}
