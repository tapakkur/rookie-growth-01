package com.gulamjan.t006.网易洗牌;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while(T-- > 0){//组数
			int n = in.nextInt();
			int k = in.nextInt();
			int array[] = new int[2*n];
			for (int i = 0; i < array.length; i++) {
				int temp = i+1;
				for (int j = 0; j < k; j++) {//用来控制洗牌次数
					//一次完整的洗牌
					if (temp <= n) {
						temp = temp*2-1;
					}else {
						temp = (temp - n) * 2;
					}
				}
		//假如 n=3 ，k=1，则数组输入顺序：先 0，2，4下标，后1，3，5下标
				array[temp-1] = in.nextInt();
			}
			//输出格式调整
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
