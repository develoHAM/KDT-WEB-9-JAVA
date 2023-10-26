package java_collection;

import java.util.*;
import java.util.Map.Entry;
import java.util.Scanner;

public class CollectionPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Map<String, Integer> hashMap = new HashMap<>();

		while (true) {
			System.out.println("이름을 입력해주세요.");
			String name = scan.next();
			if (name.equals("종료")) {
				// .entrySet(): 해당 맵에 저장된 모든 키-값 쌍을 Set<Map.Entry<K,V>> 형태로 반환
				for(Map.Entry<String, Integer> value: hashMap.entrySet()) {
					String n = value.getKey();
					int a = value.getValue();
					System.out.println("이름: " + n + ", 나이: " + a);
				}
				
//				Set<Map.Entry<String, Integer>> hashSet = hashMap.entrySet();
//				for(Entry<String, Integer> v: hashSet) {
//					System.out.println(v);
//				}
				break;
			}
			
			System.out.println("나이를 입력해주세요.");
			int age = scan.nextInt();
			
			hashMap.put(name, age);
		}
		scan.close();
	}

}
