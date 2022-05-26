package emprestimo.control;

public class EmprestimoControl {

	
	public static void emprestimoValorFinal(double valorEmprestimo, double taxaEmprestimo) {
		
		valorEmprestimo += valorEmprestimo * (taxaEmprestimo/100);
		System.out.println("Valor final do emprestimo : " + valorEmprestimo);
	}
}
