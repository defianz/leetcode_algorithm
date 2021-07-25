package Challenge.July.Week4.PADI;

class Solution {
    public int partitionDisjoint(int[] nums) {
        int answer = 1;
        int left = -1;


        for (int i = 0; i < nums.length-1; i++) {
            if(left < nums[i]) left = nums[i];
            int right = Integer.MAX_VALUE;

            for (int j = i+1; j < nums.length; j++) {
                if(right > nums[j]) right = nums[j];
            }
            if(left <= right) return i+1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("s.partitionDisjoint(new int[]{6,0,8,30,37,6,75,98,39,90,63,74,52,92,64}) = " + s.partitionDisjoint(new int[]{6, 0, 8, 30, 37, 6, 75, 98, 39, 90, 63, 74, 52, 92, 64}));
    }
}