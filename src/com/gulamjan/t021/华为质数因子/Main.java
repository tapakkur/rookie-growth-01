package com.gulamjan.t021.��Ϊ��������;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			long n = in.nextLong();
			System.out.println(getPrimeString(n));
		}
		in.close();
	}
	//�ж� n �Ƿ��Ǹ�����
	public static boolean isPrimeNumber(long  n) {
		boolean flag = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	//��ȡ����Ҫ��������ַ���
	public static String  getPrimeString(long n) {
		long temp = n;
		String string = "";
		for (int i = 2; i <= temp; i++) {
			if (isPrimeNumber(i)) {
				while(n % i == 0){
					string += i+" ";
					n = n / i;
				}
			}
		}
		return string;
	}
}
