package 백준;

import java.util.Scanner;

public class _2460번_지능형기차2_완료 {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		
		int in , out , now , max; 

		now = 0;
		max = 0;
		
		for(int i = 0 ; i < 10 ; i++) {
			out = sc.nextInt();
			in = sc.nextInt();
			now = now - out + in;
			if(max < now)
				max= now;
		}
		
		System.out.println(max);
	}
}
