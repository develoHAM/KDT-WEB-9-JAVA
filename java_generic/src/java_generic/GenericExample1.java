package java_generic;

import java.util.ArrayList;

// 일반 클래스
class MyCustomList {
	ArrayList<String> list = new ArrayList<>();

	public void addElement(String element) {
		list.add(element);
	}

	public void removeElement(String element) {
		list.remove(element);
	}
}

// 제네릭 클래스
class MyCustomListGeneric<T> {
	ArrayList<T> list = new ArrayList<>();

	public void addElement(T element) {
		list.add(element);
	}

	public void removeElement(T element) {
		list.remove(element);
	}
	
	// <T>: 타입파라미터, 명시적으로 해당 메서드가 제네릭이라는것을 표현
	public T get(int i) {
		// TODO Auto-generated method stub
		return list.get(i);
	}
	
	public <S> void hi(S elem) {
		System.out.println(elem);
	}

}

public class GenericExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCustomList list1 = new MyCustomList();
		list1.addElement("hi");
		System.out.println(list1.list);

		MyCustomListGeneric<Double> list2 = new MyCustomListGeneric<>();
		list2.addElement(3.3);
		list2.addElement((double) 4);
		System.out.println(list2.list);

		MyCustomListGeneric<String> list3 = new MyCustomListGeneric<>();
		list3.addElement("element 1");
		list3.addElement("element 2");
		list3.addElement("element 3");
		String text = list3.get(1);
		System.out.println(text);
		list3.<Integer>hi(3);
	}

}
