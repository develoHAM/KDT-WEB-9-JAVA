package first;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 0, 1, 2, 3, 4, 5 };

		// copyOf: 특정 길이 만큼 복사한 새 배열을 반환
		int[] copyOfArr = Arrays.copyOf(arr, 4);
		System.out.println(Arrays.toString(copyOfArr));

		// copyOfRange: 시작 인덱스부터 종료 인덱스 전까지의 부분을 복사한 새 배열을 반환
		int[] copyOfRangeArr = Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(copyOfRangeArr));

		// fill: 배열의 모든 요소를 주어진 값으로 채움
		int[] fillArr = new int[5];
		Arrays.fill(fillArr, 10);
		System.out.println(Arrays.toString(fillArr));
		int[] arr2 = new int[5];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		Arrays.fill(arr2, 3, arr2.length, 100);
		System.out.println(Arrays.toString(arr2));

		// sort: 배열을 오름차순으로 정렬
		int[] sortArr = { 4, 2, 6, 9, 1, 9, 5 };
		Arrays.sort(sortArr);
		System.out.println(Arrays.toString(sortArr));

		// sortArr 배열 뒤집기
		int[] reverseSortArr = new int[sortArr.length];
		for (int i = sortArr.length - 1, j = 0; i >= 0; i--, j++) {
			reverseSortArr[j] = sortArr[i];
		}
		System.out.println(Arrays.toString(reverseSortArr));
		
		// equals: 두 배열이 같은지 여부 확인, boolean 값 반환
		int[] equalsArr = {1,2,3,4,5};
		int[] compareArr = {1,2,3,3,5};
		boolean equalsResult = Arrays.equals(equalsArr, compareArr);
		System.out.println(equalsResult);
		
		// deepEquals: 다 차원 배열이 같은지 여부 확인, boolean 값 반환 
		int[][] deepEqualsArr1 = {{1,2},{4,5}};
		int[][] deepEqualsArr2 = {{1,2},{4,5}};
		boolean deepEqualsResult = Arrays.deepEquals(deepEqualsArr1, deepEqualsArr2);
		System.out.println(deepEqualsResult);
		
		// binarySearch: 미리 오름차순으로 정렬된 배열의 특정 요소값이 위치하고 있는 인덱스 위치를 반환 
		int index = Arrays.binarySearch(sortArr, 9); // sortArr = [1, 2, 4, 5, 6, 9, 9]
		System.out.println(index);
		
	}

}
