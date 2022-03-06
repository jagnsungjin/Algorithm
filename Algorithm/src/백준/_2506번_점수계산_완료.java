package 백준;

import java.util.Scanner;

public class _2506번_점수계산_완료 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 1; 
		int result = 0 ;
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		for(int i = 1 ; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]==1) {
				result += a;
				a++;
			}else if(arr[i]==0) {
				a=1;
			}


		}
		System.out.println(result);
		
		
		

	}

}
