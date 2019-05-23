package entidade;

public class PedidoItem {
	int qtditem;
	double preço;
	Produto produto;

	public PedidoItem(int qtditem, Produto produto, double valor) {
		this.qtditem = qtditem;
		this.produto = produto;
		this.preço = valor;
	}

	double somaQdtitem() {
		return preço * qtditem;
		
	}
	
	@Override
	public String toString() {
		return "\nInformaçoes do Produtos  " + produto + 
				" Quantidade Item:" + qtditem +
				"Valor Do item $: " + somaQdtitem();
	}

}
