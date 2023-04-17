package Calc;

import java.util.Scanner;

public class Matematica {

	Scanner ler = new Scanner(System.in);
	
	public double v1, v2, r;
	public int escolha, esc2; 

	public void ler() {
		System.out.println("Informe o 1o numero");
		v1 = ler.nextDouble();
		System.out.println("Informe o 2o numero");
		v2 = ler.nextDouble();
	}
	
	public void op() {
		System.out.println("Calculadora de 2 numeros:");
		System.out.println("[1]ADIÇAO [2]SUBTRAÇÃO [3]MULTIPLICAÇAO [4]DIVISAO");
		esc2 = ler.nextInt();
	}
	
	public void calculo() {
		r = v1+v2;
	}
	public void calculo1(double v1,double v2) {
		r = v1-v2;
	}
	public double calculo1() {
		r = v1*v2;
		return r;
	}
	public double calculo(double v1,double v2) {
		r = v1/v2;
		return r;
	}
	
	public int esc() {
		System.out.println("Deseja continuar?(1 para sim | 2 para não)");
		escolha = ler.nextInt();
		return escolha;
	}
	
}
