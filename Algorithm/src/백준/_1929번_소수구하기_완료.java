package 백준;

import java.util.*;

public class _1929번_소수구하기_완료 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		
		boolean[] bo = new boolean[s2+1];
		
        bo[0] = bo[1] = true;
        
        for(int i= 2; i < bo.length; i++) {
            for(int j = 2; i*j < bo.length; j++) {
                bo[i*j] = true;
            }
        }

        
        for(int i = s1 ; i <= s2 ; i++) {
        	if(bo[i] == false) {
        		System.out.println(i);
        	}
        }
        
        sc.close();


	}

}
