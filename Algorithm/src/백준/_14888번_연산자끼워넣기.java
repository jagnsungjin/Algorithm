package ����;

import java.util.Scanner;

public class _14888��_�����ڳ����ֱ� {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();			//���� ���� �Է�
		
		int[] num = new int[n];
		
		for(int i = 0 ; i< n ; i++) {		//���� �Է�
			num[i] = sc.nextInt();
		}		
		
		
		//������ ��ȣ/////////////////////////////////////////
		int openum[] = new int[4];
		for (int i = 0; i < openum.length; i++) { // ������ ���� �Է�
			openum[i] = sc.nextInt();
		}
		String[] ope = deco(openum, n);		// ������ ����ִ� �迭
		////////////////////////////////////////////
		
		
		
		

	}

	private static String[] deco(int[] openum, int n) { // ���� �� �������� �ص�
		String ope[] = new String[n - 1];

		int count = 0;

		if (openum[0] > 0) {
			for (int j = 0; j < openum[0]; j++) {
				ope[count] = "+";
				count++;
			}
		}
		if (openum[1] > 0) {
			for (int j = 0; j < openum[1]; j++) {
				ope[count] = "-";
				count++;
			}
		}
		if (openum[2] > 0) {
			for (int j = 0; j < openum[2]; j++) {
				ope[count] = "*";
				count++;
			}
		}
		if (openum[3] > 0) {
			for (int j = 0; j < openum[3]; j++) {
				ope[count] = "/";
				count++;
			}
		}

		return ope;
	}

}
