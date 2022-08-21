package controller;

public class ControllerConversaoBinario {
	
	public ControllerConversaoBinario() {
		super();
		}

	public String conversaoBin (int num, String binario) {
		
//Condi��o de parada : Se o numero de entrada for menor que 0, dever� retornar uma string vazia
		
		if(num < 1) {
			return "";
			
//Se o numero de entrada for maior que zero, ent�o ir� calcular e fazer a convers�o para bin�rio			
		}else {
			int resto = num % 2;
			int div = num / 2;
			String result = String.valueOf(resto);
			return  conversaoBin(div, result)+result;
		}
			
	
	}
}
