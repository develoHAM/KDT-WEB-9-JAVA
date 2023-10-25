package first;
import java.util.Scanner;

public class ArrayTypePractice {
	
	public double getAverage(int[] intArr) {
		int sum = 0;
		for(int value: intArr) {
			sum += value;
		}
		double result = (double)sum / intArr.length;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ArrayTypePractice practice = new ArrayTypePractice();
		
		int[] intArray = new int[5];
		
		System.out.println("5개의 정수를 입력하세요");
				
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scan.nextInt();
		}
		
		double res = practice.getAverage(intArray);
		
		scan.close();
		
		System.out.println("평균은 " + res);
		
	}

}
