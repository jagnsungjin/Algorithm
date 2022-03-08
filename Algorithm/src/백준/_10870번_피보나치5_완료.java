package 백준;

import java.util.Scanner;

public class _10870번_피보나치5_완료 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(fibo(sc.nextInt()));
	}

	private static int fibo(int n) {
		if (n==0) return 0;
		if (n==1) return 1;
		
		
		return fibo(n - 1) + fibo(n - 2);
		
	}
	
	
	

}
