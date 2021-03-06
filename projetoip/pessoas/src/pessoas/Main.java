package pessoas;

import java.util.*;

import Repositorios.RepositorioContasArray;
import Repositorios.RepositorioContasLista;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		RepositorioContasLista banco = new RepositorioContasLista();
		while (in.hasNext()) {
			String cpf = in.nextLine();
			String nome = in.nextLine();
			String idadeString = in.nextLine();
			int idade = Integer.parseInt(idadeString);
			ContaFuncionario bem = new ContaFuncionario(cpf, nome, idade);
			ContaFuncionario bem2 = new ContaFuncionario (cpf, nome, idade);
			banco.inserir(bem2);
			bem.creditar(190);
			banco.atualizar(bem);
			
			ContaAbstrata bem3 = banco.procurar(cpf);
			ContaAbstrata c2 = new ContaFuncionario (bem3.getCpf(), bem3.getNome(), bem3.getIdade());
			c2.setBonus(bem3.getBonus());
			c2.setSaldo(bem3.getSaldo());
			banco.atualizar(c2);
		}

	}

}
