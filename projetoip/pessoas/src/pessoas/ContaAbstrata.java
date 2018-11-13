package pessoas;

public abstract class ContaAbstrata {
	private String cpf; // cpf ou seja cadastro unico do cliente/funcionario.
	private String nome; 
	private int idade;
	private double saldo;
	private boolean cliente; // Diferencial para a conta ser de cliente ou de Funcionario.
	
	public ContaAbstrata (String cpf, String nome, int idade) {
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.saldo = 0.0;
		this.cliente = true;
	}
	
	public abstract void creditar (double valor); // Esse metodo existe pois o funcionario vai creditar (receber comissão) em base ao preço da compra do cliente, já o cliente é base em mero depósito.
	
	protected void setSaldo (double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setCliente(boolean cliente) {
		this.cliente = cliente;
	}

	public boolean existe(String numero) {
		if (this.cpf.equals(numero)) {
			return true;
		} else {
			return false;
		}
	}
}
