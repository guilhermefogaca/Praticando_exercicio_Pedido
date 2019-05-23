package entidade;

public class Cliente {
	
	String nome;

	public Cliente(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "\nInformaçoes do Cliente " +
				"\nNome: " +nome; 
				
				
	}
	
	
}
