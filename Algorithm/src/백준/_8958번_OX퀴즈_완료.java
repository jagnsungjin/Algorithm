package 백준;

import java.util.Scanner;

public class _8958번_OX퀴즈_완료 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int su = sc.nextInt();
		String[] starr = new String[su];
		int[] jumsuarr = new int[su];
		
		for(int i = 0 ; i < starr.length ; i++) {
			starr[i] = sc.next();
			int jumsu = 1;
			int result = 0;
			for(int j = 0 ; j < starr[i].length(); j++) {
				char s = starr[i].charAt(j);
				if(s=='O') {
					result += jumsu; 
					jumsu++ ;					
				}else {
					jumsu = 1; 
				}
				jumsuarr[i] = result;	
			}
			
		}
		
		for(int a : jumsuarr) {
			System.out.println(a);
		}
		sc.close();
		
		
		
	}

}
