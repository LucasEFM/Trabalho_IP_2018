package Lojas;

public class Lojas {
	private int codigo; // apenas 2 digitos (criar excecao)
	private int cnpj; // solicitar apenas os 15 digitos (criar excecao)
	private String endereco;

	public Lojas(int codigo, int cnpj, String endereco) {
		this.codigo = codigo;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}

	public boolean existe(int codigo) {
		if (this.codigo == codigo) {
			return true;
		} else {
			return false;
		}
	}

	// CODIGO
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return this.codigo;
	}

	// CNPJ
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public int getCnpj() {
		return this.cnpj;
	}

	// ENDERECO
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEndereco() {
		return this.endereco;
	}

}
