// QUestion link : https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/ 
public class MaxMinNumber {

    public static void MxMnNum(int arr[]) {
        int Max = arr[0], Min = arr[0];

        for (int i = arr.length - 1; i >= 0; i--) {
            Max = arr[i] > Max ? arr[i] : Max;
            Min = arr[i] < Min ? arr[i] : Min;

        }
        System.out.println("Max: " + Max + "\nMin:" + Min);

    }

}
