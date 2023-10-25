package first;
import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();
		
		// ArrayList Methods
		
		// add(element)
		list.add("Google");
		System.out.println(list);
		
		// add(index, element)
		list.add(0, "Amazon");
		System.out.println(list);
		
		// addAll(ArrayList)
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Apple");
		list2.add("Samsung");
		list.addAll(list2);
		System.out.println(list);
		
		// size()
		System.out.println(list.size());
		
		// contains(params)
		System.out.println(list.contains("Apple"));
		
		// get(index)
		System.out.println(list.get(2));
		
		// set(index, element)
		list.set(2, "Hyundai");
		System.out.println(list);
		
		// indexOf(params)
		System.out.println(list.indexOf("Apple"));
		
		// remove(index)
		list.remove(3);
		System.out.println(list);
		
		// clear()
		list.clear();
		System.out.println(list);
		
		// isEmpty()
		System.out.println(list.isEmpty());
	}

}
