package 백준;

import java.util.Arrays;
import java.util.Scanner;

public class _2693번_N번쨰큰수_완료 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		int test = sc.nextInt();
		int[] res = new int[test];
		
		for(int i = 0 ; i < test ; i ++ ) {
			for(int j = 0 ; j < arr.length ; j++) {
				arr[j] = sc.nextInt();
			}
			Arrays.sort(arr);
			res[i] = arr[7];
		}
		
		for(int i = 0 ; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
