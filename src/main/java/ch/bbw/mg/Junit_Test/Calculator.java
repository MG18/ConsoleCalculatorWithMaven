package ch.bbw.mg.Junit_Test;

public class Calculator {
	
	public int summe(int summand1, int summand2) {
		return summand1 + summand2;
	}
	
	public int subtraction(int summand1, int summand2) {
		return summand1 - summand2;
	}
	
	public int division(int divident, int divisor) {
		return divident / divisor;
	}
	
    protected int multiplikation(int faktor1 , int faktor2) {
        return faktor1 * faktor2;
    }

    int potenzieren (int basis, int exponent) {
    	
		return (int) Math.pow(basis, exponent);
    }
	
}
