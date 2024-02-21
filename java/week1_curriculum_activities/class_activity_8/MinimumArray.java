package week1_curriculum_activities.class_activity_8;

public class MinimumArray {
    public static  int min(int [] arr){
        // this line assumes that the array is not empty and it stores the first element of arr in arr
        int mini = arr[0];

        for(int i = 0; i < arr.length; i++){
            // This line checks if the index of the arr when looped is less than the current
            // element in mini which happens to be the first element in the array, index 0.
            // if it is less than it will return the value, else it iterate over the loop again
            // and stops when condition is true
            if(arr[i] < mini){
                mini = arr[i];
            }
        }
        return mini;
    }


    public static void main(String[] args) {
        int [] a = {33, 6, 10, 2};

        System.out.println(min(a));
    }
}
