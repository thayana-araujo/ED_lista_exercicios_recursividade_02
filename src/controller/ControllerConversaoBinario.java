package controller;

public class ControllerConversaoBinario {
	
	public ControllerConversaoBinario() {
		super();
		}

	public String conversaoBin (int num, String binario) {
		
//Condição de parada : Se o numero de entrada for menor que 0, deverá retornar uma string vazia
		
		if(num < 1) {
			return "";
			
//Se o numero de entrada for maior que zero, então irá calcular e fazer a conversão para binário			
		}else {
			int resto = num % 2;
			int div = num / 2;
			String result = String.valueOf(resto);
			return  conversaoBin(div, result)+result;
		}
			
	
	}
}
