public class searchInsertChallenge {

    public int searchInsert(int[] nums, int target) {

        int position = nums.length;

        for(int i=0; i < nums.length; i++) {
            if(target <= nums[i]) {
                position = i;
                break;
            }
        }
        return position;
    }

}
