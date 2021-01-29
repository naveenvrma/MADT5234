package com.madt.learning;

public class LearningActivity0 {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.Add(2,2));
	}

}


class Calculator{
	
	private float result;
	
	public float Add(float a, float b) {
		result = a + b;
		return result;
		
	}
	

	public int Substract(int a, int b) {
		return a - b;
		
	}	
	
	public double Multipy(double a, double b) {
		return a * b;
		
		
	}	
	
	public float Divide(float a, float b) {
		result = a / b;
		return result;
		
	}

}
