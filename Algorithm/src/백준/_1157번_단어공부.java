package ����;

import java.util.Scanner;
import java.util.Arrays;
public class _1157��_�ܾ���� {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);

		
		int [] arr = new int[26]; // ���ĺ� ���� 26 
		
		
		String a = sc.next().toUpperCase(); // �빮�ڷ� �Է¹���
		int [] intarr = new int[a.length()]; // 
		
		int su ;
		for(int i =0  ; i< intarr.length ; i++) {
			su = (int)(a.charAt(i) - 65) ;
			arr[su]++;
		}
		int max = arr[0];
		
		for(int i = 1 ; i< arr.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		int cnt = 0 ;
		int index = 0 ; 
		char result = '?';
		for(int i = 0 ; i< arr.length ; i++) {
			if(max == arr[i]) {
				cnt++;
				index = i ; 
			}else if(cnt >=2) {
				break;
			}
		}
		if(cnt >=2) {
			System.out.println(result);
		}else {
			System.out.println((char)(index + 65));
		}
				
		
	}

}
