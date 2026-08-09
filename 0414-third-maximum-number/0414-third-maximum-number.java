class Solution {
    public int thirdMax(int[] arr) {
        int largest = arr[0];
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                third = second;
                second = largest;
                largest = arr[i];
            } else if (arr[i] < largest) {
                if (arr[i] > second) {
                    third = second;
                    second = arr[i];
                } else if (arr[i] < second && arr[i] > third) {
                    third = arr[i];
                }

            }
        }

        if(third == Long.MIN_VALUE){
            return largest;
        }

        return (int) third;

    }
}