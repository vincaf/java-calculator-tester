package org.calculator.italy;

public class Main {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		System.out.println(calc.add(2, 1));
		System.out.println(calc.subtract(2, 1));
		System.out.println(calc.divide(4, 2));
		System.out.println(calc.multiply(2, 2));
	}

}
