package ����;

import java.util.Scanner;

public class _2609��_�ִ��������ּҰ����_�Ϸ� {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int res1 = 1 ;  //�ִ� �����
		int res2 = 1  ; //�ּ� �����
		
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		
		int ope = 2 ; //���� �� 
		
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
