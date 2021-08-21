import java.util.Arrays;

// Question Link : https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1

public class kthSmallest {
    public static void kSm(int arr[], int num) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1 - num]);
    }
}
