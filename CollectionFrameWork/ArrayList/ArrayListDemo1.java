
import java.lang.reflect.Array;
import java.util.*;

public class ArrayListDemo1 {

    // finding max. ele in AL
    public static int maxEle(ArrayList<Integer> AL) {
        int Max = Integer.MIN_VALUE;

        for (Integer n : AL) {
            if (Max < n) {
                Max = n;
            }

        }
        return Max;
    }

    // Reverse an Arrlist
    public static ArrayList<Integer> Rev(ArrayList<Integer> AL) {
        int left = 0, right = Al.size() - 1;
        while (left)
            return AL;
    }

    public static int LC11(int[] arr) {
        int area = 0, maxWater = 0, ele = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                ele = Math.min(arr[i], arr[j]);
                area = ele * (j - i);
                maxWater = Math.max(maxWater, area);

            }

        }
        return maxWater;

    }

    public static void main(String[] args) {
        // ArrayList<Integer> AL = new ArrayList<>(Arrays.asList(10, 20, 30, 10, 30));

        System.out.println(LC11(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
        // System.out.println("Max Element : " + maxEle(AL));

    }
}
