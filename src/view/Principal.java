package view;

import javax.swing.JOptionPane;

import controller.ControllerConversaoBinario;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Metodo construtor
		ControllerConversaoBinario cb = new ControllerConversaoBinario();
		

//		variavel que recebe e guarda o n�mero para calcular a convers�o para bin�rio
		String num = JOptionPane.showInputDialog("Informe um n�mero para fazer a convers�o para bin�rio: ");
		int dec = Integer.parseInt(num);		
		String conversaoBin = cb.conversaoBin(dec, "");

//		exibi��o do resultado
		System.out.println("Convers�o para bin�rio do n�mero " + num + " � : " + conversaoBin);		
	}

}
