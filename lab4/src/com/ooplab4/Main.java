package com.ooplab4;

import java.io.File;
import java.util.Scanner;
import java.util.Stack;
import java.lang.String;

public class Main {
	String string;
	Stack<Character> stk = new Stack<>();

	boolean balance = true;
	boolean exp_result = true;


	public Main(String string) {
		this.string = string;
	}

	public void Calculations() {
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '(' || string.charAt(i) == '[' || string.charAt(i) == '{') {
				if ((i + 1) == string.length()) {
					stk.push(string.charAt(i));
				} else if ((i + 1) < string.length()) {
					if ((string.charAt(i + 1) == '(') || (string.charAt(i + 1) == '-')
							|| ((string.charAt(i + 1) >= '0') && (string.charAt(i + 1) <= '9'))) {
						stk.push(string.charAt(i));
					} else balance = false;
				}
			}
			if (string.charAt(i) == ')' || string.charAt(i) == ']' || string.charAt(i) == '}') {
				if (!stk.empty()) {
					stk.pop();
				} else balance = false;
			}
		}
		if (!stk.empty() || !balance) {
			exp_result = false;
			System.out.println("The expression is not balanced: ");
		} else {
			System.out.println("The expression is balanced: ");
		}

		System.out.println(exp_result);
	}

	public static void main(String[] args) throws Exception {

		String path = "E:\\java[projects]\\lab4\\src\\com\\ooplab4\\one_expression.txt";
		File file = new File(path);
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			Main check = new Main(line);
			check.Calculations();
		}

		String path2 = "E:\\java[projects]\\lab4\\src\\com\\ooplab4\\three_expressions.txt";
		File file2 = new File(path2);
		Scanner sc2 = new Scanner(file2);

		while (sc2.hasNextLine()) {
			String line2 = sc2.nextLine();
			Main check2 = new Main(line2);
			check2.Calculations();
		}

		String path3 = "E:\\java[projects]\\lab4\\src\\com\\ooplab4\\two_expressions_example.txt";
		File file3 = new File(path3);
		Scanner sc3 = new Scanner(file3);

		while (sc3.hasNextLine()) {
			String line3 = sc3.nextLine();
			Main check3 = new Main(line3);
			check3.Calculations();
		}
	}
}

