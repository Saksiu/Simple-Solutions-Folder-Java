public class PivotIndex {
    public static void main(String[] args) {
        System.out.println("hello!");
        int[] numbers={1,2,3,10,1,2,3};
        System.out.println(binaryPivot(numbers));
    }
    public static int binaryPivot(int[] nums){  //looking for the pivot
        int sum=0,leftsum=0;

        for (int num: nums) sum+=num;
        for(int i=0;i<nums.length;i++){
            if(leftsum==sum-leftsum-nums[i])
                return i;
            leftsum+=nums[i];
        }
        return -1;
    }
}
