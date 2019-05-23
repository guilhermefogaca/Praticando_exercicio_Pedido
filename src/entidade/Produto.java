package entidade;

public class Produto {
	String nomeproduto;

	public Produto(String nomeproduto) {
		super();
		this.nomeproduto = nomeproduto;
	}

	@Override
	public String toString() {
		return "\nNome Produto: " + nomeproduto;
	}
	
	
}
