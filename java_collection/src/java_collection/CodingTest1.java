package java_collection;

public class CodingTest1 {
	
	public static int sumLessThan(int[] a, int n) {
		int result = 0;
		
		for(int v: a) {
			if(v < n) {
				result += v;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] nums1 = {10, 12, 14, 5};
		int[] nums2 = {1,1,1,1,1,1};
		System.out.println(sumLessThan(nums1, 12));
		System.out.println(sumLessThan(nums2, 5));

	}

}
