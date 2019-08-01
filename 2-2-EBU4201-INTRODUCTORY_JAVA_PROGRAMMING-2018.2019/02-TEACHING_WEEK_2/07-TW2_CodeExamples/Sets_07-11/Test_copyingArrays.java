public class Test_copyingArrays {
  public static void main(String[] args) {
    int[] nums = new int[7];
    nums[0] = 6;
    nums[1] = 19;
    nums[2] = 44;
    nums[3] = 42;
    nums[4] = 10;
    nums[5] = 20;
    nums[6] = 1;
    
    int[] nums2 = new int[nums.length-1];
    /* for (int i = 0; i < nums.length; i++) {
      nums2[i] = nums[i];
    } */

    System.arraycopy(nums, 2, nums2, 3, 2);

    // Test contents of nums2.
    for (int i = 0; i < nums2.length; i++) {
      System.out.println(nums2[i]);
    }
  }
}