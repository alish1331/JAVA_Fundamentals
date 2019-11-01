import java.util.*;

public class BasicJava {
    //Print 1-255
    public static void main(String[] args) {
        for (int i = 1; i < 256; i++) {
            System.out.println(i);
        }
    }

    //Print odd numbers between 1-255
    public static void main(String[] args) {
        for (int i = 1; i < 256; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    // Print Sum
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 256; i++) {
            System.out.print("New number: " + i);
            System.out.println(" Sum: " + (sum += i));

        }
    }

    //Iterating through an array with sorting
    public static void main(String[] args) {
        int[] myArray = {1,3,5,7,9,13,40,101,99};
        Arrays.sort(myArray);
        for (int arr: myArray) {
            System.out.println(arr);
        }
    }

    //Find Max/Min (integer method)
    public static void main(String[] args) {
        Integer[] num = {-3, -5, -7, 0};
        int max = Collections.max(Arrays.asList(num));
        int min = Collections.min(Arrays.asList(num));
        System.out.println("Maximum number of array is: " + max);
        System.out.println("Minimum number of array is: " + min);
    }

    //Find Max (primitive method)
    public static void main(String[] arr) {
        int[] myArray = new int[]{-3, -5, -7, 0, 1};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] > max){
                max = myArray[i];
            }
        }
        System.out.println("Maximum number of array is: " + max);
    }

    //Get Average
    public static void main(String[] args) {
        int[] myArray = {2, 10, 3, 4};
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < myArray.length; i++){
            sum += myArray[i];
        }
        System.out.println("The average is: " + (double)sum / myArray.length);
    }

    //Array with Odd Numbers
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();
        for (int i = 1; i < 256; i++){
            if (i % 2 == 1){
                myArray.add(i);
            }
        }
        System.out.println(myArray);
    }

    //Greater Than Y (Count numbers greater than Y in the given array)
     public static void main(String[] args) {
        int[] myArray = {1, 3, 5, 7, 4, 2};
        int y = 3;
        int count = 0;
        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] > y){
                count ++;
            }
        }
        System.out.println(count);
    }

    //Square the values
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4};
        int[] newArr = new int[myArray.length];
        int square;
        for (int i = 0; i < myArray.length; i++) {
            square = myArray[i] * myArray[i];
            newArr[i] = square;
        }
        System.out.print(Arrays.toString(newArr));
    }


    //Eliminate Negative Numbers
     static void noNegs (int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + ",");
        }
    }
    public static void main(String[] args){
        noNegs(new int[] {1, 5, 10, -2});
    }

    //Eliminate Negative Numbers v2
    static int[] get(){
        return new int[]{1, 5, 10, -2, -12};
    }

    public static void main(String[] args) {
        int[] arr = get();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                arr[i] = 0;
            }
            System.out.print(arr[i] + ",");
        }
    }

    //Max, Min, and Average
    public static void main(String[] args) {
        int[] myArray = {1, 5, 10, -2};
        int max = myArray[0];
        int min = myArray[0];
        int sum = 0;
        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] > max){
                max = myArray[i];
            }
            if (myArray[i] < min){
                min = myArray[i];
            }
            sum += myArray[i];
        }

        System.out.println("The max is: " + max);
        System.out.println("The min is: " + min);
        System.out.println("The average is: " + (double)sum / myArray.length);
    }

    //Shifting the Values in the Array
    static int[] get() {
        return new int[]{1, 5, 10, 7, -2};
    }

    public static void main(String[] args) {
        ArrayList<Integer> newArray = new ArrayList<>();
        int[] arr = get();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                newArray.add(0);
            } else {
                newArray.add(arr[i + 1]);
            }
        }
        System.out.print(newArray + ",");
    }
}