package 백준;

import java.util.Arrays;
import java.util.Scanner;

public class _2309번_일곱난쟁이_완료 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in) ;
		
		int[] arr = new int[9];
		
		int sum = 0 ; 
		int su1 = 0 ; 
		int su2 = 0 ;
		
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
	
		
		Arrays.sort(arr);
		
		for(int i =0 ; i < arr.length ; i++) {
			for(int j =i+1 ; j < arr.length ; j++) {
				if(sum-(arr[i] + arr[j]) == 100) {
					su1 = i ; su2 = j;
					break;
					
				}
			}
		}
		
		for(int i = 0 ; i< arr.length; i++) {
			if(i==su1 || i ==su2)
				continue;
			else
				System.out.println(arr[i]);
		}

		
	}


}
