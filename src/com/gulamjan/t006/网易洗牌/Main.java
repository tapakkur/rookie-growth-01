package com.gulamjan.t006.����ϴ��;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while(T-- > 0){//����
			int n = in.nextInt();
			int k = in.nextInt();
			int array[] = new int[2*n];
			for (int i = 0; i < array.length; i++) {
				int temp = i+1;
				for (int j = 0; j < k; j++) {//��������ϴ�ƴ���
					//һ��������ϴ��
					if (temp <= n) {
						temp = temp*2-1;
					}else {
						temp = (temp - n) * 2;
					}
				}
		//���� n=3 ��k=1������������˳���� 0��2��4�±꣬��1��3��5�±�
				array[temp-1] = in.nextInt();
			}
			//�����ʽ����
			if (array.length > 0) {
				System.out.print(array[0]);
			}
			for (int i = 1; i < array.length; i++) {
				System.out.print(" "+array[i]);
			}
			System.out.println();
		}
		in.close();
	}

}
