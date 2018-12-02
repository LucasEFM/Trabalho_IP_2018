package franquias;

import produtos.*;

public interface RepositorioFranquias {
	void inserir(Franquia lojas) throws CodigoCadastradoException, LimiteLojasAtingidoException;
	Franquia procurar(int codigo) throws CodigoInexistenteException;
	void remover (int codigo) throws CodigoInexistenteException;
	void atualizar (Franquia lojas);
	boolean existe (int codigo);
	void atualizarProduto(ClasseProduto produto) throws NumeroLimiteExcedido, ProdutoJaCadastrado;
}
