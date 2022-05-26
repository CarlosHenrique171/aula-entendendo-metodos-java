package calculadora;

import java.util.Scanner;

import calculadora.model.Operacoes;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		double a = scan.nextDouble();
		System.out.println("Digite um numero: ");
		double b = scan.nextDouble();
		
		System.out.println("Resultado soma : " + Operacoes.somaDoisNumeros(a,b));
		System.out.println("Resultado subtracao : " + Operacoes.subtracaoDoisNumeros(a,b));
		System.out.println("Resultado divisao : " + Operacoes.divisaoDoisNumeros(a,b));
		System.out.println("Resultado multiplicacao : " + Operacoes.multiplicacaoDoisNumeros(a,b));
		
	}

}
