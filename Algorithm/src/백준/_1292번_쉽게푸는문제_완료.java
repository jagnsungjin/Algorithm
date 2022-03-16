package 백준;

import java.util.Scanner;

public class _1292번_쉽게푸는문제_완료 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int su1 = sc.nextInt(); 
		int su2 = sc.nextInt();
		
		int result = 0 ;		// 누적 값 
		
		for(int i = su1 ; i <= su2; i++) {	//입력 값 ~ 입력 값 까지 반복
			result += hamsu(i);				//누적 값 
		}
		
		System.out.println(result);
	
		
	}
	
	private static int hamsu(int su1) {
		
		double a = 1.0;			//나눈 값 을 비교할 값
		double div = 1.0;		//나눌 값 
		
		for(double i = 1; i <=  su1 ; i++) {
			if(i/div > a) {
				div = div + 1.0;
				a = a + 0.5 ;
			}
		}
		
		int res = (int) (div/1);	
		
		return res;
	}

	


}
