package 백준;

import java.util.Scanner;

public class _3460번_이진수_완료 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		
		int t = sc.nextInt();
		
		
		for(int i =0 ; i<t ; i++) {
			int n = sc.nextInt();
			String bin = Integer.toBinaryString(n);
			for(int j = 0 ; j<bin.length(); j++ ) {
				if(bin.charAt(bin.length()-j-1)=='1') {
					System.out.print(j + " ");
				}
			}
		}
		
	}

}
