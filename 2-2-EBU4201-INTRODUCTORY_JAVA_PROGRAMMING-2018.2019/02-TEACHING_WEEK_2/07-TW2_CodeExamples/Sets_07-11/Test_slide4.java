public class Test_slide4 {
  public static void main(String[] args) {
    // int[] nums = new int[7];

    int[] nums = {1,2,3};

    nums[2] = 6;

    for (int i=0; i<nums.length; i++)
      System.out.println("nums[" + i + "]=" + nums[i]);

    nums[0] = 6;
    nums[8] = 4;  // ArrayIndexOutOfBoundsException
  }
}