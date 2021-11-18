package Exercicios1;

public class cachorro extends animal{


	//METODOS ABSTRATOS
	@Override
	public void emitirSom() {
		System.out.println("Som: au, au, au!");
	}

	@Override
	public void açao() {
		System.out.println("Ação: correndo.");		
	}
	
	
	

}
