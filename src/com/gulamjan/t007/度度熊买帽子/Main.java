package com.gulamjan.t007.度度熊买帽子;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		
		Arrays.sort(array);//按升序排好序
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		HashSet<Integer> hashSet = new HashSet<Integer>(list);
		list.clear();
		list.addAll(hashSet);
		Object[] temp = list.toArray();
		Arrays.sort(temp);
		if (temp.length >= 3) {
			System.out.println(temp[2]);
		}else {
			System.out.println(-1);
		}
		in.close();
	}
}
