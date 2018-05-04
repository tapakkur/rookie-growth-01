package com.gulamjan.t003.¾ä×Ó·´×ª;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String string = in.readLine();
		System.out.println(reverse(string));
	}
	public static String  reverse(String string) {
		return new StringBuilder(string).reverse().toString();
	}
}
