package 백준;

import java.util.Scanner;

public class _14888번_연산자끼워넣기 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();			//숫자 개수 입력
		
		int[] num = new int[n];
		
		for(int i = 0 ; i< n ; i++) {		//숫자 입력
			num[i] = sc.nextInt();
		}		
		
		
		//연산자 복호/////////////////////////////////////////
		int openum[] = new int[4];
		for (int i = 0; i < openum.length; i++) { // 연산자 갯수 입력
			openum[i] = sc.nextInt();
		}
		String[] ope = deco(openum, n);		// 연산이 들어있는 배열
		////////////////////////////////////////////
		
		
		
		

	}

	private static String[] deco(int[] openum, int n) { // 숫자 를 연산으로 해독
		String ope[] = new String[n - 1];

		int count = 0;

		if (openum[0] > 0) {
			for (int j = 0; j < openum[0]; j++) {
				ope[count] = "+";
				count++;
			}
		}
		if (openum[1] > 0) {
			for (int j = 0; j < openum[1]; j++) {
				ope[count] = "-";
				count++;
			}
		}
		if (openum[2] > 0) {
			for (int j = 0; j < openum[2]; j++) {
				ope[count] = "*";
				count++;
			}
		}
		if (openum[3] > 0) {
			for (int j = 0; j < openum[3]; j++) {
				ope[count] = "/";
				count++;
			}
		}

		return ope;
	}

}
