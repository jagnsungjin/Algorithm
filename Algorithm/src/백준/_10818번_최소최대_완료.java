package ����;

import java.util.ArrayList;
import java.util.Scanner;

public class _10818��_�ּ��ִ�_�Ϸ� {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int max = -1000001;
		int min = 1000001;
		
		int n = sc.nextInt(); 
		
		int arr[] = new int[n];
		
		
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max)
				max=arr[i];
			if(arr[i] < min)
				min=arr[i];
		}
		

		
		System.out.println(min + " " + max);
		
		
	}

}
