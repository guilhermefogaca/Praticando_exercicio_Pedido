package entidade;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.crypto.Data;

public class Pedido {
	Date datapedido;
	

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Cliente cliente;
	List<PedidoItem> lista = new ArrayList<>();

	public Pedido(Date datapedido, Cliente cliente) {
		this.datapedido = datapedido;
		this.cliente = cliente;
	}

	void additem(PedidoItem item) {
		lista.add(item);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Data Do Pedido: ");
		sb.append(sdf.format(datapedido));
		sb.append(cliente);
		
		for(PedidoItem item : lista) {
		sb.append(item);
		}
		
		return sb.toString();
			
	}
}
