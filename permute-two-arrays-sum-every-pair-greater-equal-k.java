public class solution{
  public static boolean permutatearrays(int[] arr1, int[] arr2, int k){
    Arrays.sort(arr1);
    Arrays.sort(arr2, Collections.reverseOrder());
    for(int i=0;i<arr1.length;i++){
      if(arr1[i] + arr2[i] < k) {
        return false;
      }
    }
    return true;
  }
}
    
