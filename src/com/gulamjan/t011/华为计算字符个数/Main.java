package com.gulamjan.t011.华为计算字符个数;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string = br.readLine();
		String charString = br.readLine();
		char[] ch = charString.toCharArray();
		while ((string != null)) {
			System.out.println(getStatistics(string, ch));break;
		}
	}
	public static int getStatistics(String  string ,char ch[]) {
		char array[] = string.toCharArray();
		String chString = String.valueOf(ch);
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			String arr = String.valueOf(array[i]);
			if (arr.equalsIgnoreCase(chString)) {
				counter++;
			}
		}
		return counter;
	}
}
