package java_generic;

import java.util.ArrayList;

public class GenericExample3 {

	// 와일드 카드 (?)
	public void processList(ArrayList<? extends Number> list) {

		// 값을 넣는건 불가능
		// list.add(1);

		// 값을 읽어오는건 가능
		for (Number num : list) {
			System.out.println(num);
		}
	}

	// ? super T
	public void processList2(ArrayList<? super Integer> list) {
		list.add(1);
		list.add(2);
		list.add(3);
	}
	
	// 타입파라미터
	public <T extends Number> void addToNumberList(ArrayList<T> list, T item) {
		list.add(item);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericExample3 example = new GenericExample3();
		ArrayList<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		
		ArrayList<Double> doubleList = new ArrayList<>();
		doubleList.add(1.1);
		doubleList.add(2.2);
		doubleList.add(3.3);
		
		// 와일드카드 <? extends T> 은 읽기전용으로 주로 사용됨
		example.processList(integerList);
		example.processList(doubleList);
		
		// 타입파라미터
		example.addToNumberList(integerList, 4);
		example.addToNumberList(doubleList, 4.4);
		
		System.out.println("---------------------------------");
		example.processList(integerList);
		example.processList(doubleList);
		
		// 와일드카드 <? super T> 는 쓰기전용으로 주로 사용됨
		ArrayList<Number> numbers = new ArrayList<>();
		example.processList2(numbers);
		System.out.println("---------------------------------");
		System.out.println(numbers);
		
		// 와일드카드 주의사항
		// 1. 복잡성: 와일드카드를 과도하게 사용하게 되면 복잡성이 증가하며, 협업에 알맞지않음
		// 2. 제한된작업: '? extends T' 같은경우 새로운 요소 추가 불가능
		
		
	}

}
