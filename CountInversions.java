//1.Write a program to identify the number of inversion in the array and count all such pairs in the array. 

public class CountInversions {
    public static void main(String[] args) {
        int[] arr = { 1, 9, 6, 4, 5 };
        int count = 0;

        System.out.println("Inversions:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    count++;
                }
            }
        }
        System.out.println("Total inversions: " + count);
    }
}
