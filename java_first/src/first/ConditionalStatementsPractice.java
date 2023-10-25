package first;
import java.util.Scanner;

public class ConditionalStatementsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력하세요.");
		int age = scan.nextInt();
		
		if(age >= 20) {
			System.out.println("성인");
		}
		
		if(age >= 17 && age <= 19) {
			System.out.println("고등학생");
		}
		
		if(age >= 14 && age <= 16) {
			System.out.println("중학생");
		}
		
		if(age >= 8 && age <= 13) {
			System.out.println("초등학생");
		}
		
		if(age >= 1 && age <= 7) {
			System.out.println("유아");
		}
		
		
		System.out.println("이름을 입력하세요.");
		String name = scan.next();
		
		switch(name) {
		case "홍길동":
			System.out.println("남자");
			break;
		case "성춘향":
			System.out.println("여자");
			break;
		default:
			System.out.println("모르겠어요");
		}
		
		scan.close();
		
	}

}
