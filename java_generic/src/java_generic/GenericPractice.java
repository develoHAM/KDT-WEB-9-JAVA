package java_generic;

class Pair<K, V>{
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
	
}

public class GenericPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String, Integer> pair1 = new Pair<>("One", 1);
		Pair<Integer, String> pair2 = new Pair<>(2, "Two");
		
		System.out.println("Key: " + pair1.getKey() + ", Value: " + pair1.getValue());
		System.out.println("Key: " + pair2.getKey() + ", Value: " + pair2.getValue());


	}

}
