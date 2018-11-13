package pessoas;

public interface RepositorioContas {
	void inserir(ContaAbstrata conta, boolean existe);
	ContaAbstrata procurar(String cpf);
	void remover (String cpf);
	void atualizar (ContaAbstrata cpf);
	boolean existe (String cpf);
}
