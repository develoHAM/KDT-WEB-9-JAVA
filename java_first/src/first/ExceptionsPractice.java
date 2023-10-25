package first;
import java.util.Scanner;
import java.util.InputMismatchException;


public class ExceptionsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = {1,2,3,4};
		
		try {
			for(int i = 0; i < 5; i++) {
				System.out.println(intArr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스가 범위를 벗어났습니다.");
		}
		
		Scanner scan = new Scanner(System.in);
		
		//해설
		int size = 0;
		try {
			System.out.println("배열 크기를 입력하십시오");
			size = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력하세요");
		}
		int[] array = new int[size];
		
		try {
			System.out.println("배열 요소를 입력하십시오");
			for(int i = 0; i < size; i++) {
				array[i] = scan.nextInt();
			}
			int sum = 0;
			for(int value: array) {
				sum += value;
			}
			double avg = sum / array.length;
			System.out.printf("평균은 : %.2f", avg);
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력하세요");
		} catch (ArithmeticException e) {
			System.out.println("배열의 길이는 0이 될 수 없습니다");
		}
		
		
		
//		try {
//			System.out.println("배열의 크기를 입력하세요.");
//			int a = scan.nextInt();
//			int[] arr = new int[a];
//			System.out.println("배열의 요소들을 입력해주세요.");
//			int sum = 0;
//			for(int i = 0; i < arr.length; i ++) {
//				arr[i] = scan.nextInt();
//				sum += arr[i];
//			}
//			System.out.println("평균 : " + sum/arr.length);
//		} catch(InputMismatchException e) {
//			System.out.println("숫자를 입력해주세요");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스 범위가 벗어났습니다");
//		} catch(ArithmeticException e) {
//			System.out.println("0으로 나누어 예외가 발생하였습니다");
//		}
		
	
		
		scan.close();
		
		
		
	}

}
