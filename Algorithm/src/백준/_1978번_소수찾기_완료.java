package ����;


import java.util.Scanner;

public class _1978��_�Ҽ�ã��_�Ϸ� {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int count=0 ;
		int rescount =0;
		int n = sc.nextInt();

		
		for(int i = 0 ; i < n ; i++) {
			int su = sc.nextInt();
			for(int j = 1 ; j <=su ; j++) {
				if(su % j ==0) {
					count++;
				}
			}
			if(count==2)
				rescount++;
			count = 0 ;
		}
		
		System.out.println(rescount);
	}
}
