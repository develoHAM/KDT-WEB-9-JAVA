package first;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("이름을 입력하세요");
		String name = scanner.next();

		System.out.println("나이를 입력하세요");
		int age = scanner.nextInt();

		System.out.printf("안녕하세요! %s님(%d세)", name, age).println();
		System.out.println("안녕하세요! " + name + "님(" + age + "세)");

		scanner.close();
	}

}
