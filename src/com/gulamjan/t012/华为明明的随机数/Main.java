package com.gulamjan.t012.华为明明的随机数;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			int array[] = new int[n];
			for (int i = 0; i < array.length; i++) {
				array[i] = in.nextInt();
			}
			getRandom(n, array);
		}
		in.close();
	}
	public static void getRandom(int n ,int array[]) {
		
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			set.add(array[i]);
		}
		Object[] newArray = set.toArray();
		Arrays.sort(newArray);
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}
 	}
}
