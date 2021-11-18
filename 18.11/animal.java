package Exercicios1;

public abstract class animal {
	
	
	//ATRIBUTOS
	String nome;
	int idade;
	
	//METODOS
	public abstract void emitirSom();
	public abstract void açao();
	
	//ESTADO
	public void estado() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		this.emitirSom();
		this.açao();
		System.out.println("\n");
	}
	
	//GETSET
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
}
