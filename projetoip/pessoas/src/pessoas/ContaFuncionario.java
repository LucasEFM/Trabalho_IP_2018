package pessoas;

public class ContaFuncionario extends ContaAbstrata {
	private int bonus; // a cada venda se recebe um ponto de bônus.

	public ContaFuncionario(String cpf, String nome, int idade) {
		super(cpf, nome, idade);
	}

	public void creditar(double valor) {
		if (this.bonus < 9) {
			this.setSaldo(this.getSaldo() + (0.30 * valor));
			this.bonus += 1;
		} else { // quando bonus = 10; o funcionario ganha um bonus na venda
			this.setSaldo(this.getSaldo() + (0.30 * valor) + valor);
			this.bonus = 0;
		}
	}
	
	public void cliente () {
		this.setCliente(false);
	}
	

	
	
}
