package first;

public class Array2Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2차원배열로 4년 평점 구하기(1~4학년까지)
		double[][] score = { { 3.5, 3.7 }, { 4.0, 4.1 }, { 3.2, 3.0 }, { 3.8, 3.0 } };

		double sum = 0;
		for (int i = 0; i < score.length; i++) { //학년별
			for(int j = 0; j < score[i].length; j++) { //학년의 학기별
				sum += score[i][j]; // 전체 평점 합
			}
		}
		int n = score.length;
		int m = score[0].length;
		System.out.println(sum/(n*m));
	}

}
