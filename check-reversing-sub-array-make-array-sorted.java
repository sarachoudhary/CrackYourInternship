import java.util.*;

public class proelevate {

    public static boolean ispossible(int[] arr){
        int start = -1;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i + 1] < arr[i]){
                start = i;
                break;
            }
        }
        if(start == -1){
            return true;
        }
        int end = -1;
        for(int i = start; i < arr.length - 1; i++){
            if(arr[i + 1] > arr[i]){
                end = i;
                break;
            }
        }
        if(end == -1){
            end = arr.length - 1;
        }
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i=0; i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int arr[] = { 1, 2, 4, 5, 3 };
        System.out.println(ispossible(arr));
    }
}
