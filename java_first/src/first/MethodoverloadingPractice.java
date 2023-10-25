package first;
import java.util.Scanner;

public class MethodoverloadingPractice {
	
	public void practice1(double a, double b) {
		System.out.printf("덧셈 결과 : %.1f", a + b).println();
		System.out.printf("뺄셈 결과 : %.1f", a - b).println();
		System.out.printf("나눗셈 결과 : %f", a / b).println();
		System.out.printf("곱셈 결과 : %.1f", a * b).println();
	}
	
	public double practice2(double radius) {
		return radius * radius * Math.PI;
	}
	
	public double practice2(double width, double height) {
		return width * height;
	}
	
	public double practice2(double base, double height, boolean isT) {
		if(isT) {
			return base * height ;			
		} else {
			return practice2(base, height);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		MethodoverloadingPractice practice = new MethodoverloadingPractice();
		
		System.out.println("숫자 두 개를 입력하세요");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		practice.practice1(num1, num2);
		
		System.out.println("반지름 5인 원의 넓이 : " + practice.practice2(5));
		System.out.println("가로4 세로7 직사각형 : " + practice.practice2(4,7));
		System.out.println("밑변6 높이 4 삼각형 : " + practice.practice2(6,3,true));

		
		System.out.println();
		
		scan.close();
	}

}
