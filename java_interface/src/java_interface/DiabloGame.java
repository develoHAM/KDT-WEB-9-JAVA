package java_interface;

public class DiabloGame implements GameConsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("위로 점프");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("쪼그려 앉기");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("오른쪽으로 점프");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("왼쪽으로 점프");
	}

}
