package java_class;
import java.util.Scanner;
import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		// 실습 1
		System.out.println("사각형의 가로와 세로 길이를 띄어쓰기 기준으로 입력해주세요.");
		int width1 = scan.nextInt();
		int height1 = scan.nextInt();
		Rectangle rect1 = new Rectangle(width1, height1);
		System.out.println(rect1.area());
		
		
		// 실습 2
		ArrayList<Rectangle> rectArrayList = new ArrayList<>();
						
		while(true) {
			System.out.println("사각형의 가로와 세로 길이를 띄어쓰기 기준으로 입력해주세요.");
			int width2 = scan.nextInt();
			int height2 = scan.nextInt();
			
			if(width2 == 0 && height2 == 0) {
				for(Rectangle value: rectArrayList) {
					System.out.println("가로 길이는 : " + value.getWidth());
					System.out.println("세로 길이는 : " + value.getHeight());
					System.out.println("넓이는 : " + value.area());
					System.out.println("--------------------------------------");
				}
				// 실습 3
				System.out.println("Rectangle 인스턴스의 개수는 : " + Rectangle.getCount());
				break;
			}
			Rectangle rect2 = new Rectangle(width2);
			rect2.setHeight(height2);
			rectArrayList.add(rect2);
			
		}
		
		scan.close();
	}

}
