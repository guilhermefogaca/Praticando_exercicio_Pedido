package entidade;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class ProgramaPedidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Informe os Dados Do Cliente: ");
			System.out.println("Nome: ");
			String nome = sc.next();
			
			Cliente c1 = new Cliente(nome);
			Pedido pedido = new Pedido(new Date(),c1);
			
			System.out.println("Quantides de Item Comprados: ");
			int n = sc.nextInt();
			
			for(int i=1 ; i<=n ; i++) {
				System.out.println("Informe Os Dados Do Produto #" +i+": ");
				System.out.println("Nome Do Produto: ");
				String nomeproduto =sc.next();
				
				Produto p1 = new Produto(nomeproduto);
				
				System.out.println("Preço do Produto: ");
				double valor = sc.nextDouble();
				
				System.out.println("Quantidade do Produto " + nomeproduto + " : ");
				int qtd = sc.nextInt();
				
				PedidoItem pi = new PedidoItem(qtd, p1,valor);
				
				pedido.additem(pi);
			}
			
			System.out.println(pedido);
			
			sc.close();
	}

}
