package com.gulamjan.t002.句子反转;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String string = new String();
			string = in.readLine();
			sentence(string);
	}
	public static void sentence(String string) {
		String array[] = string.split(" ");//按空格分离字符串
		for (int i = array.length-1; 0 <= i; i--) {
			if (i > 0) {
				System.out.print(array[i]+" ");
			}
			if (i == 0) {
				System.out.println(array[0]);
			}
		}
	}
}
