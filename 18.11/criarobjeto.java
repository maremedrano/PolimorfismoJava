package Exercicios1;

public class criarobjeto {

	public static void main(String[] args) {
		
		
		
		cachorro cac = new cachorro();
		cac.setNome("Lola");
		cac.setIdade(4);
		cac.estado();
		
		cavalo cav = new cavalo();
		cav.setNome("Juca");
		cav.setIdade(10);
		cav.estado();
		
		pregui�a pre = new pregui�a();
		pre.setNome("Pupo");
		pre.setIdade(3);
		pre.estado();
		

	}

}
