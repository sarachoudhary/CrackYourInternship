class Solution {
    public static void mergesort(int[] nums, int si, int ei){
        int mid = si + (ei - si)/2;
        if(si >= ei){
            return;
        }
        mergesort(nums, si, mid);
        mergesort(nums, mid+1, ei);
        merge(nums, si, mid, ei);
    }

    public static void merge(int[] nums, int si, int mid, int ei){
        int aux[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= ei){
            if(nums[i] > nums[j]){
                aux[k] = nums[j];
                j++;
            } else {
                aux[k] = nums[i];
                i++;
            }
            k++;
        }
        while(i <= mid){
            aux[k] = nums[i];
            k++;
            i++;
        }
        while(j <= ei){
            aux[k] = nums[j];
            k++;
            j++;
        }
        k = 0;
        i = si;
        while(k < aux.length){
            nums[si++] = aux[k++];
        }
    }
    public void sortColors(int[] nums) {
        //Merge Sort
        mergesort(nums, 0, nums.length - 1);
    }
}
