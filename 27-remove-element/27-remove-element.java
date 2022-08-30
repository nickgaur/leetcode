class Solution {
    public int removeElement(int[] arr, int val) {
        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            while(arr[high] == val){
                high--;
                if(high <= 0){
                    break;
                }
            }
            if(arr[low] != val){
                low++;
            }
            else {
                int temp = arr[high];
                arr[high] = arr[low];
                arr[low] = temp;
            }
        }
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == val){
                return count;
            }
            count++;
        }
        return count;
    }
}