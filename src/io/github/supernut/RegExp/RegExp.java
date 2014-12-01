package io.github.supernut.RegExp;

import java.util.regex.*;

public class RegExp {
	public static void main(String[] args){
		Pattern pattern = Pattern.compile("");
		Matcher matcher = pattern.matcher("This is the input string");
		matcher.matches();
	}
}
