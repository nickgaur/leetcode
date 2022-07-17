class Solution {
    public boolean containsDuplicate(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length;i++){
        
            if(map.get(arr[i]) == null){
                map.put(arr[i], arr[i]);
            }
            else{
                return true;
            }
        }
        return false;
    }
}