package TA04_05;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, b = 2, c = 3, d = 4;
		System.out.println("Valor de a : "+a+", valor de b : "+b+", valor de c : "+c+", valor de d : "+d);
		b = c;
		c = a;
		a = d;
		d = b;
		System.out.println("Valor de a : "+a+", valor de b : "+b+", valor de c : "+c+", valor de d : "+d);
	}

}
