package java_collection;

import java.util.*;
import java.util.Scanner;

public class CollectionPractice1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Set<Integer> set = new HashSet<>();

		while (true) {
			System.out.println("정수를 입력해주세요.");
			int inputValue = scan.nextInt();
			if (inputValue == -1) {
				System.out.println(set);
				break;
			}
			set.add(inputValue);
		}
		
		scan.close();
	}
}
