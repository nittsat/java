/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
  public static void main (String[]args)
  {
    int[] nums = { -1, 0, 3, 5, 9, 12 };
    int target = 91;
    int pivot = BinarySearch (nums, target);
    System.out.println (pivot);
  }

  public static int BinarySearch (int[]nums, int target)
  {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right)
      {
	int mid = (left + right) / 2;

	if (nums[mid] == target)
	  return mid;
	if (nums[mid] <= target)
	  left = mid + 1;
	else
	  right = mid - 1;
      }

    return -1;


  }
}

