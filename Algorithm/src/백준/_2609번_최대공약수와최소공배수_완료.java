package 백준;

import java.util.Scanner;

public class _2609번_최대공약수와최소공배수_완료 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int res1 = 1 ;  //최대 공약수
		int res2 = 1  ; //최소 공배수
		
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		
		int ope = 2 ; //나눌 값 
		
		for(int i = 0 ; i < 1 ; i--) {
			if(su1 % ope ==0 && su2 % ope==0) {
				su1 = su1 / ope ; su2 = su2/ ope;
				res1 = ope * res1 ; 
				ope = 2;
				
			}else {
				ope++;
				if(ope > su1 && ope > su2) {
					res2 = res1 * su1 * su2;
					break;
				}
			}
		}
		
		
		System.out.println(res1);
		System.out.println(res2);
		
		
	}

}
