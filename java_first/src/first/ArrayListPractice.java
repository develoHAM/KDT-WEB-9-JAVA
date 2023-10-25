package first;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strArr = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자를 입력해주세요 : ");
			String temp = scan.nextLine();
			if(temp.equals("exit")) {
				for(String str: strArr) {
					System.out.println(str);
				}
				break;
			} else {
				strArr.add(temp);
			}
		}
		
		scan.close();
		
	}

}
