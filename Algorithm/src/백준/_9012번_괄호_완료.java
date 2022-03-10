package 백준;

import java.util.*;

public class _9012번_괄호_완료 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int cas = sc.nextInt();
		String[] resultarr = new String[cas];
		
		for(int i = 0 ; i< cas ; i++) {
			String a = sc.next();
			String result = hamsu(a);
			resultarr[i] = result ;
		}
		
		for(String a : resultarr) {
			System.out.println(a);
		}
		
	}
	
	static String hamsu(String str) {
		Stack<Character> st = new Stack<Character>();
		for(int i = 0 ; i < str.length() ; i++) {
			char a = str.charAt(i);
			
			if(a=='(')
				st.push(a);
			else if (st.empty())
				return "NO";
			else 
				st.pop();
				
		}
		if(st.empty())
			return "YES";
		else
			return "NO";
		
	}
}
