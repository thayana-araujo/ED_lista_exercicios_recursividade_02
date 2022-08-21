package view;

import javax.swing.JOptionPane;

import controller.ControllerConversaoBinario;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Metodo construtor
		ControllerConversaoBinario cb = new ControllerConversaoBinario();
		

//		variavel que recebe e guarda o número para calcular a conversão para binário
		String num = JOptionPane.showInputDialog("Informe um número para fazer a conversão para binário: ");
		int dec = Integer.parseInt(num);		
		String conversaoBin = cb.conversaoBin(dec, "");

//		exibição do resultado
		System.out.println("Conversão para binário do número " + num + " é : " + conversaoBin);		
	}

}
