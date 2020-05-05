import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static boolean results = false;

    public static boolean reach(Integer arr[]) {
        int currentSteps = arr[0];
        if(currentSteps <= 0) {
            return false;
        }
        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length-1) {
                return true;
            }
            currentSteps = Math.max(currentSteps, arr[i]);
            if(currentSteps <= 0){
                return false;
            }
            currentSteps--;
        }
        return false;
    }

    public static void main(String[] args) {

        Integer arr[] = new Integer[]{2, 0, 1, 0, 2};

        System.out.println(reach(arr));


    }
}
