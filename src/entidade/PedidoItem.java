package entidade;

public class PedidoItem {
	int qtditem;
	double pre�o;
	Produto produto;

	public PedidoItem(int qtditem, Produto produto, double valor) {
		this.qtditem = qtditem;
		this.produto = produto;
		this.pre�o = valor;
	}

	double somaQdtitem() {
		return pre�o * qtditem;
		
	}
	
	@Override
	public String toString() {
		return "\nInforma�oes do Produtos  " + produto + 
				" Quantidade Item:" + qtditem +
				"Valor Do item $: " + somaQdtitem();
	}

}
