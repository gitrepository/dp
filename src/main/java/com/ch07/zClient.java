package com.ch07;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;


public class zClient {

	public static void main(String[] args) {
		IDuck duck = new DuckMallard();

		ITurkey turkey = new TurkeyWild();
		IDuck turkeyDuck = new AdapterTurkey(turkey);

		System.out.println("Real Duck");
		duck.quack();
		duck.fly();
		System.out.println();
		System.out.println("Duck thru Turkey Adaptor");
		turkeyDuck.quack();
		turkeyDuck.fly();
		System.out.println();

		/*
		 * REAL World example
		 */
		Iterator<String> itr = setupList().iterator();

	    Enumeration<String> enm = setupVector().elements();
	    Iterator<String> enmItr = new AdapterEnumeration(enm);

		System.out.println("Real Iterator");
		while(itr.hasNext()) {
			Object element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();
		System.out.println("Enumeration thru Iterator Adaptor");
		while(enmItr.hasNext()) {
			Object element = enmItr.next();
			System.out.print(element + " ");
		}
	}

	private static Vector<String> setupVector(){
	      Vector<String> dayNames = new Vector<String>();
	      dayNames.add("Sunday");
	      dayNames.add("Monday");
	      dayNames.add("Tuesday");
	      dayNames.add("Wednesday");
	      dayNames.add("Thursday");
	      dayNames.add("Friday");
	      dayNames.add("Saturday");
	      return dayNames;
	}

	private static List<String> setupList(){
	      List<String> monthsNames = new ArrayList<String>();
	      monthsNames.add("Jan");
	      monthsNames.add("Feb");
	      monthsNames.add("Mar");
	      monthsNames.add("Apr");
	      monthsNames.add("May");
	      monthsNames.add("Jun");
	      monthsNames.add("Jul");
	      return monthsNames;
	}


}
