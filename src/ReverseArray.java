
// Question link : https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/ 

public class ReverseArray {

    public static void rvs(int array[]) {

        int temp, start = 0, end = array.length - 1;
        while (start <= end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
