package com.bilgeadam;

import org.apache.commons.lang3.StringUtils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
public class TestMyClass {

	public static void main(String[] args) {
		
		MyClass mC = new MyClass("ryt", "yyıuyıuy", 10, 20, 0.0);
		System.out.println(mC);
		mC.setStr1("AAAAAAAAAAAAAAAA");
		System.out.println(mC.getStr1());
		
		MyClass mC2 = new MyClass();
		
		String x = "ABC";
		x="VBN";
	}
}
