package com.gulamjan.t005.分苹果;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
//		while(in.hasNext()){
			int n = in.nextInt();
			int frequency = 0;//次数
			int array[] = new int[n];
			int sum = 0 ,average = 0;
			for (int i = 0; i < array.length; i++) {
				array[i] = in.nextInt();
				sum += array[i];
			}
			
			if (sum % array.length != 0) {//若取模为了0 ，则可以整除
				System.out.println(-1);
				return;
			}else {
				average = sum / array.length;
				int lowCounter = 0;
				int lowSum = 0;
				for (int i = 0; i < array.length; i++) {
					if (Math.abs(average - array[i]) % 2 != 0) {
						System.out.println(-1);
						return;
					}
					if (array[i] < average) {
						lowCounter++;
						lowSum += array[i];
					}
				}
				frequency = (lowCounter * average - lowSum) / 2;
			}
			System.out.println(frequency);
//		}
		in.close();
	}
	
}
