package com.recepkabakci;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class MyClass {
	
	private String str1;
	private String str2;
	private int    int1;
	private int    int2;
	private double double1;
	
	public String getStr1() {
		return this.str1 + "lkjjkjkjkl";
	}

	public MyClass(String str12, String str22, int int12, int int22, double double12) {
		// TODO Auto-generated constructor stub
	}
}
