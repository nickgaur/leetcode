class Solution {
    static int calendar[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int days[] = new int[366];
        int aliceStartMonth = Integer.parseInt(arriveAlice.substring(0, 2));
        int aliceEndMonth = Integer.parseInt(leaveAlice.substring(0, 2));
        int start = 0;
        int end = 0;
        for (int i = 1; i < aliceStartMonth; i++) {
            start = start + calendar[i];
        }
        for (int i = 1; i < aliceEndMonth; i++) {
            end = end + calendar[i];
        }

        int aliceStartDate = Integer.parseInt(arriveAlice.substring(3, 5));
        int aliceEndDate = Integer.parseInt(leaveAlice.substring(3, 5));
        for (int i = start + aliceStartDate; i <= end + aliceEndDate; i++) {
            days[i]++;
        }

        int bobStartMonth = Integer.parseInt(arriveBob.substring(0, 2));
 int bobEndMonth = Integer.parseInt(leaveBob.substring(0, 2));
        start = 0;
        end = 0;
        for (int i = 1; i < bobStartMonth; i++) {
            start = start + calendar[i];
        }
        for (int i = 1; i < bobEndMonth; i++) {
            end = end + calendar[i];
        }

        int bobStartDate = Integer.parseInt(arriveBob.substring(3, 5));
        int bobEndDate = Integer.parseInt(leaveBob.substring(3, 5));
        for (int i = start + bobStartDate; i <= end + bobEndDate; i++) {
            days[i]++;
        }
    int res = 0;
        for (int i = 0; i < 366; i++) {
            if(days[i] > 1){
                res++;
            }
        }

        return res;
    }
}