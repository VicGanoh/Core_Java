package array_exercise;
/*
Given an array of numbers, write a program to find a number which has the same sum of numbers
on it's either side
 */
public class array {
    //Function to compute partition
    static int Findnum(int arr[], int size){
        int left_sum = 0;
        int right_sum = 0;

        //Computing right_sum
        for(int i=1;i<size;i++){
            right_sum += arr[i];
        }

        //verify if leftsum == rightsum
        for (int i=0, j=1;j<size;i++,j++) {
            right_sum -= arr[j];
            left_sum += arr[i];
            if (left_sum == right_sum)
                return arr[i + 1];
        }


      return 0;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,6};
        int size = arr.length;

        System.out.println(Findnum(arr,size));
           }
}
