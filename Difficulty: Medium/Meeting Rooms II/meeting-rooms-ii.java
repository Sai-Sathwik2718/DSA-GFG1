class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
         int n=start.length;

        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0;
        int j = 0;

        int currentOverlap = 0;
        int maxOverlap = 0;

        while(i < n) {

            // New interval starts
            if(start[i] <end[j]) {

                currentOverlap++;

                maxOverlap = Math.max(
                    maxOverlap,
                    currentOverlap
                );

                i++;

            } else {

                // One interval ended
                currentOverlap--;

                j++;
            }
        }

        return maxOverlap;
    }
}
