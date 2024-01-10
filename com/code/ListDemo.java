package com.code;
import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> lit=new ArrayList<>();
		lit.add(4);
		lit.add(90);
		lit.add(34);
		System.out.println("list="+lit);
		
		ArrayList<Integer> lit2=new ArrayList<>();
		lit2.add(4);
		lit2.add(90);
		lit2.add(34);
		System.out.println(lit2);
		
		lit.addAll(lit2);
		System.out.println("list="+lit);
	}

}
