package first;
import java.util.Scanner;

public class scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름, 나이, 키, 결혼 여부를 빈칸으로 분리하여 입력하세요.");
		
		//System.in: 표준 입력 스트림을 나타내며, 주로 키보드 입력을 받기 위해 사용 
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next(); //공백 이전까지의 문자열 잃기
		int age = scanner.nextInt(); //정수 읽기 
		double height = scanner.nextDouble(); //실수 읽기
		boolean single = scanner.nextBoolean(); //논리값 읽기 
		
		System.out.printf("이름은 %s, 나이는 %d, 키는 %.1f, 결혼은 %b", name, age, height, single);
		
		scanner.close();
	}

}
