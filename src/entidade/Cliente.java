package entidade;

public class Cliente {
	
	String nome;

	public Cliente(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "\nInforma�oes do Cliente " +
				"\nNome: " +nome; 
				
				
	}
	
	
}
