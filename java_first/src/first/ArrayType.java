package first;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열 출력 기초
		
		//방법1. for문 이용
//		int[] intArray = { 1, 2, 3, 4, 5 };
//		
//		for(int i = 0; i < intArray.length; i++) {
//			System.out.print(intArray[i] + " ");
//		}
		
		//방법2. Arrays.toString() 배열의 요소를 문자열로 반환
		Scanner scan = new Scanner(System.in);
		int[] intArray = new int[5]; //크기가 5인 int배열
		
		System.out.println("숫자 5개를 입력하세요");
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = scan.nextInt();
		}
//		
		//방법2. Arrays.toString() 배열의 요소를 문자열로 반환
//		System.out.println(intArray);
//		System.out.print(Arrays.toString(intArray));
		
		//방법3. for-each문 사용
		int sum = 0;
		for(int arr: intArray) {
			System.out.print(arr + " ");
			sum += arr;
		}
		System.out.println(sum);
		
		scan.close();
	}

}
