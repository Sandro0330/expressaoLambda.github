package entidades;

public class Produto {

	private String nome;
	private Double preco;

	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public static boolean produtoPredicateStatic(Produto p) {
		return p.getPreco() >= 100.0;
	}
	
	public boolean produtoPredicateNaoStatic() {
		return preco >= 100.0;
	}
	
	@Override
	public String toString() {
		return "Nome do produto = " + nome + String.format(": R$%.2f",  preco);
	}
	
}
