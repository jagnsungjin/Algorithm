package ����;
import java.io.*;

public class _9996��_�ѱ��̱׸��ﶩ��������������_�Ϸ� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String pattern = br.readLine();		//����
		String[] pArr = pattern.split("\\*");	//*�� �������� �ΰ��� ���ڿ��� ������ (*�� �������� �������� 2�� �ٿ������)
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();		//������ ���� �̸�
			///*�� �� ���� ���ڿ����� ������ ���� �̸� ���̰� ª���� ������ �ȵ�
			if (pArr[0].length() + pArr[1].length() > str.length()) {
				System.out.println("NE");
				continue;
			}
			
			String front = str.substring(0, pArr[0].length());	//�����̸� �պκ�
			String back = str.substring(str.length()-pArr[1].length(), str.length());	//�����̸� �޺κ�
			
			if (front.equals(pArr[0]) && back.equals(pArr[1])) {	//��, �� ��� ���ϰ� ���ٸ� ��ġ
				System.out.println("DA");
			} else {
				System.out.println("NE");
			}
		}
	}
}