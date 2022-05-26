package emprestimo;

import java.util.Scanner;

import emprestimo.control.EmprestimoControl;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do emprestimo : ");
		double valorEmprestimo = scan.nextDouble();
		System.out.println("Digite a taxa do emprestimo (em porcentagem sem o simbolo [%]): ");
		double taxaEmprestimo = scan.nextDouble();
		
		EmprestimoControl.emprestimoValorFinal(valorEmprestimo,taxaEmprestimo);
		
	}

}
