package com.aish.java8.lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;

class Employee {
	int eNo;
	String eName;

	public Employee(int eNo, String eName) {
		super();
		this.eNo = eNo;
		this.eName = eName;
	}

	@Override
	public String toString() {
		return eNo+" : "+eName;
	}

}

public class CustomClassSortingWithLamdaExpression {

	public static void main(String[] args) {

		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(12, "Aishi"));
		l.add(new Employee(19, "Shubhi"));
		l.add(new Employee(2, "Durga"));
		l.add(new Employee(8, "Mhashya"));
		System.out.println("before" + l);
		// lambda expression
		Collections.sort(l, (e1, e2) -> (e1.eNo > e2.eNo) ? -1 : (e1.eNo < e2.eNo) ? 1 : 0);
		System.out.println("after" + l);
	}

}
