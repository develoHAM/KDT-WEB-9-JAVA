package java_collection;

import java.util.Arrays;

public class CodingTest2 {
	
	public static int[] findIndices(int[]a, int target) {
		
		int[] result = new int[2];
		
		for(int i = 0; i < a.length; i++) {
			boolean found = false;
			for(int j = 0; j < a.length; j++) {

				if(a[i] + a[j] == target) {
					result[0] = i;
					result[1] = j;
					found = true;
					break;
				}
			}
			if (found ) {
				break;
			}
		}
		
		return result;
		
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums2 = {3,2,4,7,6,8,5};
		int[] nums3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		int[] result2 = findIndices(nums2, 9);
		int[] result3 = findIndices(nums3, 5);

		System.out.println(Arrays.toString(result2));
		System.out.println(Arrays.toString(result3));

	}

}
