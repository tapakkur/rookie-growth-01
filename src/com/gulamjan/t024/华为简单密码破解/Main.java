package com.gulamjan.t024.华为简单密码破解;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String string = in.next();
			System.out.println(getBreaking(string));
		}
		in.close();
	}
	public static String getBreaking(String string) {
		char array[] = string.toCharArray();
		String tempString = "";
		for (int i = 0; i < array.length; i++) {
			String s = String.valueOf(array[i]);
			switch (s) {
			case "1":
				s = "1";
				break;
			case "2":
				s = "2";
				break;
			case "3":
				s = "3";
				break;
			case "4":
				s = "4";
				break;
			case "5":
				s = "5";
				break;
			case "6":
				s = "6";
				break;
			case "7":
				s = "7";
				break;
			case "8":
				s = "8";
				break;
			case "9":
				s = "9";
				break;
			case "0":
				s = "0";
				break;
			case "a":
				s = "2";
				break;
			case "b":
				s = "2";
				break;
			case "c":
				s = "2";
				break;
			case "d":
				s = "3";
				break;
			case "e":
				s = "3";
				break;
			case "f":
				s = "3";
				break;
			case "g":
				s = "4";
				break;
			case "h":
				s = "4";
				break;
			case "i":
				s = "4";
				break;
			case "j":
				s = "5";
				break;
			case "k":
				s = "5";
				break;
			case "l":
				s = "5";
				break;
			case "m":
				s = "6";
				break;
			case "n":
				s = "6";
				break;
			case "o":
				s = "6";
				break;
			case "p":
				s = "7";
				break;
			case "q":
				s = "7";
				break;
			case "r":
				s = "7";
				break;
			case "s":
				s = "7";
				break;
			case "t":
				s = "8";
				break;
			case "u":
				s = "8";
				break;
			case "v":
				s = "8";
				break;
			case "w":
				s = "9";
				break;
			case "x":
				s = "9";
				break;
			case "y":
				s = "9";
				break;
			case "z":
				s = "9";
				break;
			case "A":
				s = "b";
				break;
			case "B":
				s = "c";
				break;
			case "C":
				s = "d";
				break;
			case "D":
				s = "e";
				break;
			case "E":
				s = "f";
				break;
			case "F":
				s = "g";
				break;
			case "G":
				s = "h";
				break;
			case "H":
				s = "i";
				break;
			case "I":
				s = "j";
				break;
			case "J":
				s = "k";
				break;
			case "K":
				s = "l";
				break;
			case "L":
				s = "m";
				break;
			case "M":
				s = "n";
				break;
			case "N":
				s = "o";
				break;
			case "O":
				s = "p";
				break;
			case "P":
				s = "q";
				break;
			case "Q":
				s = "r";
				break;
			case "R":
				s = "s";
				break;
			case "S":
				s = "t";
				break;
			case "T":
				s = "u";
				break;
			case "U":
				s = "v";
				break;
			case "V":
				s = "w";
				break;
			case "W":
				s = "x";
				break;
			case "X":
				s = "y";
				break;
			case "Y":
				s = "z";
				break;
			case "Z":
				s = "a";
				break;
			}
			tempString += s;
		}
		return tempString;
	}
}
