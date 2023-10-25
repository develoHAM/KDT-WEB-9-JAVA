package first;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0으로 나눴을때
		
//		try {
//			int num1 = 4;
//			int num2 = 0;
//			
//			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
//		} catch(ArithmeticException e) {
//			System.out.println("0으로 나누어 예외가 발생하였습니다");
//			System.out.println(e);
//		}
//		
//		System.out.println("여기까지 읽힐까?");
		
		//인덱스 범위를 벗어났을때
		
//		int[] intArray = {1,2,3,4};
//		
//		try {
//			for(int i = 0; i < 5; i++) {
//				System.out.println(intArray[i]);
//			}
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스 범위가 벗어났습니다");
//		}
		
		//입력 오류 발생시
		Scanner scan = new Scanner(System.in);
		try {
			int num = scan.nextInt();
		} catch (InputMismatchException e){
			System.out.println("입력오류. 정수를 입력하세요.");
			System.out.println(e);
		}
		
		//숫자변환오류
		//NumberFormatException
		
		//파일이 존재하지 않을때(컴파일러에 의해 체크됨)
		//FileNotFoundException
		
		//객체참조가 null인상태에서 객체의 메서드나 속성에 접근할때
		//NullPointerException
		
		scan.close();
	}

}
