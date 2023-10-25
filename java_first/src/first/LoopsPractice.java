package first;
import java.util.Scanner;

public class LoopsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int number = scan.nextInt();
		
		for(int i = 1; i <= number; i++) {
			System.out.println(i);
		}
		
		scan.close();
	}

}
