package first;

public class MethodOverloading {
	
	//자바스크립트
	//function a ( a, b, c = 0 ){}
	//a(1,2)
	
	//메소드 오버로딩
	//정수 두개를 더하는 메소드 
	public int add(int a, int b) {
		return a + b;
	}
	
	//실수 두개를 더하는 메소드
	public double add(double a, double b) {
		return a + b;
	}
	
	//정수 세개를 더하는 메소드
	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading calc = new MethodOverloading();
		
		System.out.println(calc.add(10, 20));
		System.out.println(calc.add(0.15, 0.3));
		System.out.println(calc.add(10, 100, 1000));
	}

}
