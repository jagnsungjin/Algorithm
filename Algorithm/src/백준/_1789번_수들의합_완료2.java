package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1789��_��������_�Ϸ�2 {
	public static void main(String args[]) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = null;
	        
	        st = new StringTokenizer(br.readLine());
	      	long s = Long.parseLong(st.nextToken()); 
	      	
	      	long count=1;
	      	long sum=1;
	      	
	      	while(sum<s){
	      		count++;
	      		sum+=count;
	      	}
	      	if(sum>s){
	  			count--;
	  		}

	      	
	      	System.out.println(count);
		
	}
}
